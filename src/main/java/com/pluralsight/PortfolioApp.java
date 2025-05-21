package com.pluralsight;

import Finance.BankAccount;
import Finance.CreditCard;

import java.util.Scanner;

public class PortfolioApp {

    CreditCard cc = new CreditCard();

    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter asset type (house, bank, credit): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.print("Enter asset value: ");
            double value = Double.parseDouble(scanner.nextLine());

            switch (type) {
                case "house":
                    portfolio.addAsset(new House(value));
                    break;
                case "bank":
                    portfolio.addAsset(new BankAccount(value));
                    break;
                case "credit":
                    portfolio.addAsset(new CreditCard(value));
                    break;
                default:
                    System.out.println("Unknown type.");
            }

            System.out.print("Add another asset? (yes/no): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("yes"));

        scanner.close();

        System.out.println("Total portfolio value: $" + portfolio.getValue());
        System.out.println("Most valuable asset: $" + portfolio.getMostValuable().getValue());
        System.out.println("Least valuable asset: $" + portfolio.getLeastValuable().getValue());
    }
}
