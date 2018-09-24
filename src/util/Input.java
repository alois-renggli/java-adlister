package util;

import java.awt.*;
import java.util.Scanner;

public class Input {

//    Create an input validation class
//
//    Create directory inside of src named util.
// Inside of util, create a class named Input that has a private
// property named scanner. When an instance of this object is created,
// the scanner property should be set to a new instance of the Scanner class.

// The class should have the following methods, all of which return command
// line input from the user:
//
//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()
//    The yesNo method should return true if the user
// enters y, yes, or variants thereof, and false otherwise.
//
// The getInt(int min, int max) method should
// keep prompting the user for input until they give an integer
// within the min and max. The getDouble method should do the same thing,
// but with decimal numbers.
//
//    Create another class named InputTest that has a static main method
// that uses all of the methods from the Input class.

    private Scanner scanner = new Scanner(System.in);

//    public Input {
//        scanner = new Scanner(System.in).useDelimiter("\n");
//    }

//    new Scanner(System.in);

    public String getString() {
//        System.out.println("Enter a string:");
        return scanner.nextLine();
    }
    boolean yesNo(){
        System.out.println("Confirm Yes or No:");
        String input = scanner.nextLine();
        if(input.toLowerCase().contains("y")){
            return true;
        }
        else{
            return false;
        }

    }
    public int getInt(int min, int max){
        System.out.printf("Enter a number from %s to %s:\n", min, max);
        int input = scanner.nextInt();
        if (input > max || input < min){
            System.out.println("Invalid entry! Input another number");
            return getInt(min, max);
        }
        else{
            System.out.printf("You entered %s!\n", input);
            return input;
        }
    }
    public int getInt(){
        System.out.printf("Enter a number:\n");
        int input = scanner.nextInt();
        System.out.printf("You entered %s!\n", input);
        return input;
    }
    double getDouble(double min, double max){
        System.out.printf("Enter a number from %s to %s:\n", min, max);
        double input = scanner.nextInt();
        if (input > max || input < min){
            System.out.println("Invalid entry! Input another number\n");
            return getDouble(min, max);
        }
        else{
            System.out.printf("You entered %s!", input);
            return input;
        }
    }
    double getDouble(){
        System.out.printf("Enter a number:\n");
        double input = scanner.nextInt();
        System.out.printf("You entered %s!", input);
        return input;
    }
}
