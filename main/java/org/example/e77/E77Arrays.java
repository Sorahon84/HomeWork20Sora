package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};
        // Use a loop to iterate through the array and find the highest value
        int high = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > high)
                System.out.println(numbers[i]);
        }       // Print the highest value found in the array


    }
}