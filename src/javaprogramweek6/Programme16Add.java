package javaprogramweek6;

import java.util.Scanner;

/** write a JAVA program to add two binary numbers
 * input data:
 * Input first binary number:10
 * Input secondary binary number:11
 * expected output
 * sum of two binary numbers: 101
 */
public class Programme16Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String firstNumber = scanner.next();
        System.out.print("Input second binary number: ");
        String secondNumber = scanner.next();

        addBinary(firstNumber, secondNumber);//calling the method to add binary numbers

        scanner.close();
    }
    //method for two variables
    public static void addBinary(String fs, String ss) {
     int num1 = Integer.parseInt(fs, 2);
     int num2 = Integer.parseInt(ss, 2);
     int sum = num1 + num2;
     String result = Integer.toBinaryString(sum);
        System.out.print("Sum of Binary numbers: " + result);


    }
}
