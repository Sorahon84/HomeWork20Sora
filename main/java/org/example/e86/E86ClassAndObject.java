package org.example.e86;

public class E86ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Student'
        // Declare a String variable named 'name' and an integer variable named 'roll_no'
        // Create an object of the class 'Student'
        Student student=new Student();
        // Assign the value "John" to the 'name' variable
        student.name="John";
        // Assign the value 2 to the 'roll_no' variable
        student.roll_no=2;
        // Print the values of 'name' and 'roll_no' in the specified format
        System.out.println("Name is " + student.name + " and roll number is " + student.roll_no);

    }
}