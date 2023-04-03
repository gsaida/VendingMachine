package com.techelevator;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Printer {



Scanner scanner = new Scanner("C:/Users/Student/workspace/First Capstone/java-minicapstonemodule1-team2/log.txt");
//change paramaters to things you need in log type of transaction change in money and final balance after the transaction
    //call
    public void writeToFile(Transaction transaction, Inventory slots) throws FileNotFoundException {

        try (PrintWriter pw = new PrintWriter (
                new FileOutputStream("C:/Users/Student/workspace/First Capstone/java-minicapstonemodule1-team2/log.txt", true)
        )) {
            pw.print("\n" + String.valueOf(LocalDateTime.now()).substring(0, 10) + " ");
            pw.print(String.valueOf(LocalDateTime.now()).substring(11, 19) + " ");

    if (transaction.getLoggingTransaction() == 1) {
        pw.print("FEED MONEY " + "$" + transaction.getDollarAmount() + " ");
        pw.print(" $" + transaction.getCustomerBalance());
    } else if (transaction.getLoggingTransaction() == 2) {
        pw.print(slots.getSlots().get(transaction.getProductCode()).getName() + " " + "$" + slots.getSlots().get(transaction.getProductCode()).getPrice());
        pw.print(" $" + transaction.getCustomerBalance());



        } else if (transaction.getLoggingTransaction() == 3) {
            pw.print("MAKING CHANGE $" + transaction.getCustomerBalance() + " $0.00");
        }



        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
