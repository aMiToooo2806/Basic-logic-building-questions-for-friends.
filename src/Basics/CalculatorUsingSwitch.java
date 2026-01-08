package Basics;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = "";

        do {

            System.out.println("--- New Calculation ---");
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Clear the buffer!
            sc.nextLine();

            System.out.println("Enter operation (+, -, *, ^ to Stop):");
            operation = sc.nextLine();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + (a + b));
                    break;
                case "-":
                    System.out.println("Result: " + (a - b));
                    break;
                case "*":
                    System.out.println("Result: " + (a * b));
                    break;
                case "^":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            //Loop while operation is NOT "^"
        } while (!operation.equals("^"));


    }
}