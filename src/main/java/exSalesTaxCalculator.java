/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exSalesTaxCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double amt = sc.nextDouble();
        System.out.println("What state do you live in?");
        String state = sc.next();
        double tax = 0;
        if(state.compareToIgnoreCase("WI") == 0)
        {
         tax = .05*amt;
         System.out.println("What county do you live in?");
         String garbage = sc.next();
         String county = sc.nextLine();
            if(county.compareToIgnoreCase("Eau Claire") == 0)
            {
                tax = tax+0.005;
            }
            else if(county.compareToIgnoreCase("Dunn") == 0)
            {
                tax = tax+0.004;
            }
        }
        else if(state.compareToIgnoreCase("IL") == 0)
        {
            tax = 0.08*amt;
        }

        double total = amt+tax;
        System.out.printf("The tax is $%.2f. \nThe total is $%.2f.", tax, total);
    }
}
