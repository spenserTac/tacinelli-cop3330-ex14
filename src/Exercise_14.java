/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String temp1 = scanner.nextLine();
        float amount = Float.parseFloat(temp1);

        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        if(state.equals("WI")){
            double taxed = (double) amount * 1.055;
            double tax_amount = (double) amount * 0.055;
            System.out.print("The subtotal is $" + String.format("%.2f", amount) + ".\nThe tax" +
                    " is $" + tax_amount + ".\nThe total is $" + String.format("%.2f", taxed));
            return;
        }

        System.out.println("The total is $" + String.format("%.2f", amount));

    }
}
