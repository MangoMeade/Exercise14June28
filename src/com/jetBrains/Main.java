package com.jetBrains;
import java.util.Scanner;
//Authors: Math and Andres
//Program outputs the square of the numbers 0 to the number chosen by the user.

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr  = new Scanner(System.in);
        int userInput = 0;
        double output = 0;
        String cont = "y";

        do {
            System.out.println("Enter a number");
            userInput = scnr.nextInt();
            for (int i = 1; i < userInput + 1; i++) {
                output = Math.pow(i, 2);
                System.out.print((int) output + " ");
            }
            scnr.nextLine();
            System.out.println("\nContinue?");
            cont = scnr.nextLine();
        } while(cont.equalsIgnoreCase("y"));
    }
}
