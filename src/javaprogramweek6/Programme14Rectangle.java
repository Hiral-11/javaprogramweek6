package javaprogramweek6;

/** Write a java program to print the area and perimeter of rectangle
 * test data width=5.5 height=8.5
 * Expecyted output:
 * Area is 5.6*8.5=47.60
 * perimeter is 2*(5.6 + 8.5)=28.20
 *
 */

public class Programme14Rectangle {
    static float width = 5.6F; //width variable
    static float height = 8.5F; // height variable

    //calculate the area method
    public static void calculateArea (){
        System.out.println("Area is " + width + " * " + height + " = " + width*height);

    }
    //calculate perimeter method
    public static void calculatePerimeter(){
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + 2 *(width+height));
    }

    public static void main(String[] args) {
        calculateArea();//calling directly as its a declared static
        calculatePerimeter();//calling directly as its a declare static
    }
    }

