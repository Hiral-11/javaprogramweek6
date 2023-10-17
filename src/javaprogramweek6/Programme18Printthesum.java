package javaprogramweek6;

/** write a program to print the sum(addition),multiply,subtract,divide and remainder of two numbers
 * test data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output:
 * 125 + 24 =149
 * 125 - 24 =101
 * 125 * 24 =3000
 * 125 / 24 =5
 * 125 mod 24 =5
 */

public class Programme18Printthesum {
    public static void main(String[] args) {
        calculation (125, 24);
    }

    private static void calculation(int a, int b){
        System.out.print("125 + 24 = ");
        System.out.println(a + b);
        System.out.print("125 -24 = ");
        System.out.println(a- b);
        System.out.print("125 * 24 = ");
        System.out.println(a * b);
        System.out.print("125 / 24 = ");
        System.out.println(a / b );
        System.out.print("125 mod 24 = ");
        System.out.println(a % b);
    }
}
