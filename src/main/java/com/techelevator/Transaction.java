package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Transaction extends VendingMachineCLI {

    private final BigDecimal QUARTER = BigDecimal.valueOf(0.25);
    private final BigDecimal DIME = BigDecimal.valueOf(0.10);
    private final BigDecimal NICKEL = BigDecimal.valueOf(0.05);


    private static final Scanner userInput = new Scanner(System.in);
//    Slots slots = new Slots();

    private BigDecimal balance;
    private BigDecimal customerBalance;
    private BigDecimal change;
    private String productCode;
    private String userDone;
    private int loggingTransaction = 2;
    private String dollarAmount;

    public String getDollarAmount() {
        return dollarAmount;
    }

    public String getUserDone() {
        return userDone;
    }

    public int getLoggingTransaction() {
        return loggingTransaction;
    }

    public String getProductCode() {
        return productCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(BigDecimal customerBalance) {
        this.customerBalance = customerBalance;
    }

    public Transaction(BigDecimal balance, BigDecimal customerBalance) {
        this.balance = BigDecimal.valueOf(0.0);
        this.customerBalance = BigDecimal.valueOf(0.0);
    }

            public void feedingMoney (String paymentSelection, Printer print, Transaction transaction, Inventory slots) throws FileNotFoundException {

                if (paymentSelection.equals("1")) {
                    System.out.print("Enter whole number dollar amount to insert: ");
                    dollarAmount = userInput.nextLine();
                    setCustomerBalance(new BigDecimal(dollarAmount));
                    System.out.println(dollarAmount);
                    loggingTransaction = 1;
                    print.writeToFile(transaction, slots);
                } else if (paymentSelection.equals("2")) {

                } else if (paymentSelection.equals("3")) {
                    System.exit(0);
                } else {
                    System.out.println("Please enter valid option (1, 2, or 3)");
                }
            }

            public String selectProduct (Inventory slots, Printer print, Transaction transaction) throws FileNotFoundException {
                File file = new File("VendingMachine.csv");

                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("File not found!");
                }
                System.out.println("Balance is: " + customerBalance);
                System.out.print("Type in the code of product you'd like to select: ");
                productCode = userInput.nextLine();
                System.out.println(slots.getSlots().get(productCode).getName() + ", " + slots.getSlots().get(productCode).getPrice() + ", " + slots.getSlots().get(productCode).getSoundMessage());
                loggingTransaction = 2;
                print.writeToFile(transaction, slots);
                customerBalance = customerBalance.subtract(slots.getSlots().get(productCode).getPrice());
                return productCode;

            }

            public void retrievingProduct (String productCode, Inventory slots, Display welcomeDisplay, Printer print, Transaction transaction) throws FileNotFoundException {
                System.out.println("Enter 0 if you are done purchasing");
                System.out.println("Enter 1 if you like to continue");
                userDone = userInput.nextLine();
                if (userDone.equals("0")) {
                    makingChange(customerBalance, welcomeDisplay, print, transaction, slots);
                    loggingTransaction = 3;
                    print.writeToFile(transaction, slots);
                }

                while (!userDone.equals("0")) {
                    System.out.println("Enter another code");
                    productCode = userInput.nextLine();

                    if (slots.getSlots().containsKey(productCode)) {
                        //   int updateSlots = slots.getSlots().get(productCode).getQuantity();

                        if (customerBalance.subtract(slots.getSlots().get(productCode).getPrice()).signum() < 0) {
                            System.out.println("You didn't have enough money!");
                            System.out.println(makingChange(customerBalance, welcomeDisplay, print, transaction, slots));
                           // put in here
                            loggingTransaction = 3;
                            print.writeToFile(transaction, slots);

                        }
                        if (slots.getSlots().get(productCode).getQuantity() > 0) {
                            StuffedAnimal animal = slots.getSlots().get(productCode);
                            animal.dispenseAnimal();
                            // added printer writer here!
                            loggingTransaction = 2;
                            print.writeToFile(transaction, slots);
                            System.out.println(animal.getName() + ", " + animal.getPrice() + ", " + animal.getSoundMessage());

                            customerBalance = customerBalance.subtract(slots.getSlots().get(productCode).getPrice());
                            System.out.println("You have " + change(customerBalance, slots) + " left");
                            System.out.println("Enter 0 if you are done purchasing");
                            System.out.println("Enter 1 if you like to continue");
                            userDone = userInput.nextLine();
                            if (userDone.equals("0")) {
                                makingChange(customerBalance, welcomeDisplay, print, transaction, slots);
                                loggingTransaction = 3;
                                print.writeToFile(transaction, slots);
                                welcomeDisplay.welcomeDisplay();
                            }
                        }
                    } else {
                        System.out.println("SOLD OUT! SORRY!");
                    }
                }
            }

        public BigDecimal change (BigDecimal customerBalance, Inventory slots){
            return customerBalance = customerBalance.subtract(slots.getSlots().get(productCode).getPrice());

        }

        public BigDecimal makingChange (BigDecimal customerBalance, Display welcomeDisplay, Printer print, Transaction transaction, Inventory slots) throws FileNotFoundException {

            while (customerBalance.signum() > 0) {

                if (customerBalance.doubleValue() >= 0.25) {
                    System.out.println("Quarter");
                    customerBalance = customerBalance.subtract(new BigDecimal(.25));
                } else if (customerBalance.doubleValue() >= 0.10) {
                    System.out.println("Dime");
                    customerBalance = customerBalance.subtract(new BigDecimal(0.10));
                } else if (customerBalance.doubleValue() >= 0.05) {
                    System.out.println("Nickel");
                    customerBalance = customerBalance.subtract(new BigDecimal(0.05));
                }
            }
            loggingTransaction = 3;
            print.writeToFile(transaction, slots);
            userDone = "0";
            welcomeDisplay.welcomeDisplay();

            return customerBalance;
        }
    }


