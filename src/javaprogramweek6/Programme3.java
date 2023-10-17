package javaprogramweek6;

/**declare one instance and one static variables
 * declare one instance method
 * declare one static method
 * call both instance and static variables into both instance and static methods inside the print statment
 * declare the main method
 * call both instance and static methods into the Main method and run programme
 */



public class Programme3 {
// declare one instance and one static variables
    int a = 1;
    static int b = 2;

    //declare instance method
public void Method1(){
    System.out.println(a);//call both instance and static variable into both instance and staticmethods inside print statment
    System.out.println(b);//call both instance and static variable into both instance and staticmethods inside print statment
}
//declare static method
public static void Method2(){
    Programme3 obj = new Programme3();
    System.out.println(obj.a);//call both instance and static variable into both instance and staticmethods inside print statment
    System.out.println(b);//call both instance and static variable into both instance and staticmethods inside print statment



}
    public static void main(String[] args) {//declare the main method
       Method2();//call both instance and static methods into the Main method and run programme
       Programme3 obj = new Programme3();//call both instance and static methods into the Main method and run programme
        obj.Method1();

    }
}
