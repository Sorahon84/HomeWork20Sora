package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? (true/false)");
        // Capture the thirsty input
        boolean isThirsty = scanner.nextBoolean();
        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? (true/false)");
        // Capture the sleepy input
        boolean isSleepy = scanner.nextBoolean();
        // Determine the drink based on the input
        if (isThirsty && !isSleepy){
            System.out.println("Looks like you need to drink water");
        } else if (isThirsty && isSleepy) {
            System.out.println("Looks like you need to drink coffee");
        } else if (!isThirsty && isSleepy) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }
        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}