package javaprogramweek6;

/** declare two instance and two static variables
 * declare one instance method
 * declare one static method
 * call all four instance and static variables into both instance and static methods inside the print statment
 * declare the Main method
 * call both instance and static methods into main method and run the programme
 */
public class Programme4 {
    //declare two instance and two static variables
    int a = 10;
    String name = "Hiral";
    static int b = 20;
    static  String surname = "Karelia";

    //declare one instance method
    public void Method1(){
        System.out.println(a);//call all four instance and static variables into instance method inside print statment
        System.out.println(name);
        System.out.println(b);
        System.out.println(surname);
    }
    //declare one static method
    static public void Method2(){
      Programme4 obj = new Programme4();//call all four instance and static variables into instance method inside print statment
        System.out.println(obj.a);
        Programme4 obj1 = new Programme4();
        System.out.println(obj1.b);
        System.out.println(surname);
    }
    //declare main method
    public static void main(String[] args) {
        Programme4 obj = new Programme4(); //object to call instance method in static method
        obj.Method1();//instance method by object
        Method2(); // static method directly

    }

}
