package javaprogramweek6;

import java.util.Scanner;

/** write a java program that takes three numbers as input to calculate and
 * print the average of numbers
 */

public class Programme13Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Average of three number is: " + (num1 + num2 + num3) / 3);
        scanner.close();

    }
}
