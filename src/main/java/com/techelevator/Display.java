package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Display extends VendingMachineCLI {

    private static final Scanner userInput = new Scanner(System.in);

    String firstChoice;
    private String paymentSelection;
    public String newString = "";

    public String getPaymentSelection() {
        return paymentSelection;
    }
    public void setPaymentSelection(String paymentSelection) { this.paymentSelection=paymentSelection; }





    public void welcomeDisplay() {

        System.out.println("(1) Display vending machine items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        System.out.print("Enter 1, 2, or 3 to access options above: ");
        firstChoice = userInput.nextLine();

    }

    public void choosingItems() {

            Transaction transaction = new Transaction(BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0));


            if (firstChoice.equals("3")) {
                System.exit(0);
            } else if (firstChoice.equals("1")) {
                File file = new File("VendingMachine.csv");

                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found!");
                }
                System.out.println("\n(2) Purchase");
                System.out.println("(3) Exit");
                System.out.print("Enter 2 or 3 to access options above: ");
                String secondChoice = userInput.nextLine();

                if (secondChoice.equals("3")) {
                    System.exit(0);
                } else if (secondChoice.equals("2")) {
                    System.out.println("\nCurrent money provided: " + transaction.getCustomerBalance());
                    System.out.println("\n(1) Feed money");
                    System.out.println("(2) Select Product");
                    System.out.println("(3) Finish Transaction");
                    System.out.print("Enter 1, 2, or 3 to access options above: ");
                    paymentSelection = userInput.nextLine();
                }
            } else if (firstChoice.equals("2")) {
                System.out.println("\nCurrent money provided: " + transaction.getCustomerBalance());
                System.out.println("\n(1) Feed money");
                System.out.println("(2) Select Product");
                System.out.println("(3) Finish Transaction");
                System.out.print("Enter 1, 2, or 3 to access options above: ");
                paymentSelection = userInput.nextLine();
            } else {
                System.out.println("Please enter valid option (1, 2, or 3)");
            }
        }




}
