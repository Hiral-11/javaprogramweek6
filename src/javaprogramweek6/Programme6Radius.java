package javaprogramweek6;

import java.util.Scanner;

/** Write a program to enter any radius value of the circle and find out area
 * Formula of area A=PI*r*r)
 */

public class Programme6Radius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = scanner.nextDouble();
        double area =(77*r*r)/5;
        scanner.close();

        System.out.println("Area of Circle is: " + area);
    }
}
