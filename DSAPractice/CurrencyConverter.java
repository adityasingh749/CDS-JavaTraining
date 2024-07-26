package DSAPractice;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount in INR: ");
                double inr = sc.nextDouble();
                double usd = inrToUsd(inr);
                System.out.println(inr + " INR is " + usd + " USD");
                break;
            case 2:
                System.out.println("Enter amount in USD: ");
                usd = sc.nextDouble();
                inr = usdToInr(usd);
                System.out.println(usd + " USD is " + inr + " INR");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
    public static double inrToUsd(double inr) {
        double conversionRate = 0.012;
        return inr * conversionRate;
    }

    public static double usdToInr(double usd) {
        double conversionRate = 83.72;
        return usd * conversionRate;
    }
}
