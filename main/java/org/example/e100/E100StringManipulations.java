package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In: ");

        // Read the input string
        String word = inp.nextLine();
        String reversed="";
        // Use a for loop to reverse the string
        for (int i = word.length()-1; i >= 0; i--) {
            reversed+=word.charAt(i);
        }
        // Print the reversed string
        System.out.println(reversed);
        //ISssue resolved
        //check once

    }
}