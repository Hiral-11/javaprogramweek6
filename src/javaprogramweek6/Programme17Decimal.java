package javaprogramweek6;

import java.util.Scanner;

/** Write a Java program to convert a decimal number to binary number.
 * Input data:
 * input a decimal number:5
 * expected output
 * Binary number is:101
 *
 */

public class Programme17Decimal {
    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Deimal Number : ");
        dec_num = scanner.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;

        }
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {

            System.out.print(bin_num[j]);
        }

    }
}





