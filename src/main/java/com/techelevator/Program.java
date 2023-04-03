package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

//        Display welcomeDisplay = new Display();
//        welcomeDisplay.welcomeDisplay();


        VendingMachineCLI vendingMachineCLI = new VendingMachineCLI();
        vendingMachineCLI.runVendingMachine();

//        Transaction transaction = new Transaction(BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0));
//        transaction.everythingMoney();
//
//        transaction.change(transaction.getCustomerBalance());
//        transaction.makingChange(transaction.getCustomerBalance());

    }
}
