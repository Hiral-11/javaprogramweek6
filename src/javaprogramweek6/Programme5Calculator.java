package javaprogramweek6;

import java.util.Scanner;

/** write a program for calcultor
 * with addition, subtraction, multiplication and division methods
 * all with parameters and use string concatenation methods and scanner.
 * (Note: two static and two instance methods)
 */

public class Programme5Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator (+, -, *, /): ");
        String operator = scanner.nextLine();
        System.out.println("Enter the first operand: ");
        int operand1 = scanner.nextInt();
        System.out.println("Enter the second operand: ");
        int operand2 = scanner.nextInt();
        scanner.close();
        Programme5Calculator calculator = new Programme5Calculator();
        switch (operator) {
            case "+":
                System.out.println("Result of " + operand1 + " + " + operand2 + " is " + calculator.addition(operand1, operand2));
                break;
            case "-":
                System.out.println("Result of " + operand1 + " - " + operand2 + " is " + calculator.subtraction(operand1, operand2));
            case "*":
                System.out.println("Result of " + operand1 + " * " + operand2 + " is " + calculator.multiplication(operand1, operand2));
                break;
            case "/":
                double[] result = calculator.division(operand1, operand2);
                System.out.println("Result of " + operand1 + " / " + operand2 + " is " + result[0] + ", remainder is " + result[1]);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double[] division(int a, int b) {
        double quotient = (double) a / b;
        double remainder = a % b;
        return new double[]{quotient, remainder};


    }
}


