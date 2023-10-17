package javaprogramweek6;

import java.util.Scanner;

/** write a program to convert the upper case to lower case.
 *
 */

 public class Programme9Uppercase {

         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter a string in uppercase: ");
             String uppercaseString = scanner.nextLine();
             String lowercaseString = uppercaseString.toLowerCase();
             System.out.println("The lowercase string is: " + lowercaseString);
             scanner.close();
         }

     }

