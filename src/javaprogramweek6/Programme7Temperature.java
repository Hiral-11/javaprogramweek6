package javaprogramweek6;

import java.util.Scanner;

/**write a programm to insert any temperature value in degree Fahrenheit
 * and convert to degree celsius ((F − 32) × 5/9 = 0°C)
 */

public class Programme7Temperature {
   public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
       System.out.print("Input a degree in Fahrenheit: ");
       double fahrenheit = scanner.nextDouble();
       scanner.close();

       double celcius =(( 5 *(fahrenheit - 32.0)) / 9.0);
       System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celsius");
   }
}
