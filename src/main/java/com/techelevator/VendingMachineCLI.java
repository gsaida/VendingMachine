package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class VendingMachineCLI {

	private static final Scanner userInput = new Scanner(System.in);

	public void runVendingMachine() throws FileNotFoundException {

		Inventory slots = new Inventory();

		slots.fillSlots();

		Printer printer = new Printer();

		Display welcomeDisplay = new Display();
		welcomeDisplay.welcomeDisplay();
		welcomeDisplay.choosingItems();

		Transaction transaction = new Transaction(BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0));
		transaction.feedingMoney(welcomeDisplay.getPaymentSelection(), printer, transaction, slots);
	//	printer.writeToFile(transaction, slots);
		transaction.selectProduct(slots, printer, transaction);
	//	printer.writeToFile(transaction, slots);
		transaction.retrievingProduct(transaction.getProductCode(), slots, welcomeDisplay, printer, transaction);

		while (transaction.getUserDone().equals("1")) {
			printer.writeToFile(transaction, slots);
		}

		while(transaction.getUserDone().equals("0")) {

			welcomeDisplay.welcomeDisplay();
			welcomeDisplay.choosingItems();
			transaction.feedingMoney(welcomeDisplay.getPaymentSelection(), printer, transaction, slots);

			transaction.selectProduct(slots, printer, transaction);
			transaction.retrievingProduct(transaction.getProductCode(), slots, welcomeDisplay, printer, transaction);

		}

		transaction.change(transaction.getCustomerBalance(), slots);
		transaction.makingChange(transaction.getCustomerBalance(), welcomeDisplay, printer, transaction, slots);





//		System.out.println(LocalDateTime.now());
//		System.out.println("(1) Display vending machine items");
//		System.out.println("(2) Purchase");
//		System.out.println("(3) Exit");
//		System.out.print("Enter 1, 2, or 3 to access options above: ");
//		String firstChoice = userInput.nextLine();

//		String payment = "";

//		Transaction transaction = new Transaction(BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0));
		//StuffedAnimal stuffedAnimal = new StuffedAnimal(name, price)

//		if (firstChoice.equals("3")) {
//			System.exit(0);
//		} else if (firstChoice.equals("1")) {
//			File file = new File("VendingMachine.csv");
//
//			try(Scanner scanner = new Scanner(file)){
//				while(scanner.hasNextLine()){
//					System.out.println(scanner.nextLine());
//				}
//			}
//			catch (FileNotFoundException e){
//				System.out.println("File not found!");
//			}
//			System.out.println("\n(2) Purchase");
//			System.out.println("(3) Exit");
//			System.out.print("Enter 2 or 3 to access options above: ");
//			String secondChoice = userInput.nextLine();
//
//			if (secondChoice.equals("3")) {
//				System.exit(0);
//			} else if (secondChoice.equals("2")) {
//				System.out.println("\nCurrent money provided: " + transaction.getCustomerBalance());
//				System.out.println("\n(1) Feed money");
//				System.out.println("(2) Select Product");
//				System.out.println("(3) Finish Transaction");
//				System.out.print("Enter 1, 2, or 3 to access options above: ");
//				payment = userInput.nextLine();
//			}
//		} else if (firstChoice.equals("2")) {
//			System.out.println("\nCurrent money provided: " + transaction.getCustomerBalance());
//			System.out.println("\n(1) Feed money");
//			System.out.println("(2) Select Product");
//			System.out.println("(3) Finish Transaction");
//			System.out.print("Enter 1, 2, or 3 to access options above: ");
//			payment = userInput.nextLine();
//		} else {
//			System.out.println("Please enter valid option (1, 2, or 3)");
//		}

//		if (payment.equals("1")) {
//			System.out.print("Enter whole number dollar amount to insert: ");
//			String dollarAmount = userInput.nextLine();
//			transaction.setCustomerBalance(new BigDecimal(dollarAmount));
//			System.out.println(transaction.getCustomerBalance());
//		} else if (payment.equals("2")) {
//
//			File file = new File("VendingMachine.csv");
//
//			try(Scanner scanner = new Scanner(file)){
//				while(scanner.hasNextLine()){
//					System.out.println(scanner.nextLine());
//				}
//
//			}
//			catch (FileNotFoundException e){
//				System.out.println("File not found!");
//			}
//			System.out.print("Type in the code of product you'd like to select: ");
//			String productCode = userInput.nextLine();
//
//			if (slots.getSlots().containsKey(productCode)){
//				System.out.println(slots.getSlots().get(productCode).getName() + ", " + slots.getSlots().get(productCode).getPrice() + ", " + slots.getSlots().get(productCode).getSoundMessage());
////				System.out.println("Balance remaining: " + transaction.getCustomerBalance()-newMap.get(productCode).getPrice());
//			}
//
//		} else if (payment.equals("3")) {
//			System.exit(0);
//		} else {
//			System.out.println("Please enter valid option (1, 2, or 3)");
//		}
//
//	}
	}
}
