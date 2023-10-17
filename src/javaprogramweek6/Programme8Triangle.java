package javaprogramweek6;

import java.util.Scanner;

/** Write a program to calculate the area of triangle
 *
 */

public class Programme8Triangle {

    public static void area(int h, int b){
        int area =(b * h) / 2; //area of triangle formula
        System.out.println("The area of triagle with base lenght " + b + " and height " + h + " is " + area);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height of triangle: ");
        int height = scanner.nextInt();
        scanner.close();

        System.out.println("Please enter base length of triangle : ");
        int baselenght = scanner.nextInt();
        area(height, baselenght);
        scanner.close();



    }

}
