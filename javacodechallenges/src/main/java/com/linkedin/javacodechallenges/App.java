package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        // 1 CCF - 1496 gallon
        // min. 18.84 for 2 CCF
        double oneCcf = 748;
        double first2CCF = 1496;
        double additionalUsage;
        double additionalCharge = 3.90;
        long noOfAdditionalCharge = 0;
        double bill = 18.84;
        // System.out.println(first2CCF);
        if (gallonsUsage <= first2CCF) {
            // System.out.println("less than equal to 1st 2 ccf");
            return bill;
        } else {
            additionalUsage = gallonsUsage - first2CCF;
            while (additionalUsage > 0) {
                noOfAdditionalCharge += 1;
                additionalUsage = additionalUsage - oneCcf;
                System.out.println("remaining..." + additionalUsage);
            }
            // System.out.println(additionalUsage);
            // System.out.println("numer of additional charges :" + noOfAdditionalCharge);
            bill = bill + (additionalCharge * noOfAdditionalCharge);
            // System.out.println(bill);
            return bill;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
