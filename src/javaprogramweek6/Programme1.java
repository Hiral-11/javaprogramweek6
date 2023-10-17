package javaprogramweek6;

public class Programme1 {

    /** declare two instance variables
     * declare one instance method
     * call both variables into instance method using the print statment
     * declare the Main method
     * call above instance method into main method and run programme
      */
    //declare two instance variables
    int a = 10;
    int b= 20;

// declare one instance method
public void Method1() {
    //call both variables into instance method using the print statment
    System.out.println(a);
    System.out.println(b);
}

    // declare main method
    String name = "Homework";
public static void main(String[] args){
    //call above instance method into main method and run programme
    Programme1 obj = new Programme1();
    obj.Method1();
}
}
