package javaprogramweek6;

import java.util.Scanner;

/** write a Java program to swap two variables
 *
 */

public class Programme15Swap {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first variable: ");
       int first = scanner.nextInt();
       System.out.println("Enter the second variable: ");
       int second = scanner.nextInt();
       System.out.println("Before swapping: first = " + first + ", second = " + second);
       int temp = first;
       first = second;
       second = temp;
       System.out.println("After swapping: first = " + first + ", second = " + second);
       scanner.close();

   }
}
