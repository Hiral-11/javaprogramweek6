package javaprogramweek6;


public class Programme2 {

        /** declare two static variables
         * declare one static method
         * call both static variables into static method inside print statement
         * declare the main method
         * call the above instance method into the main method and run the programme
          */
        //declared two static variables
        static int a = 5;
        static int b = 15;

       // declare one static method
        public static void Method1(){
            //called both static variables into static method inside print method
            System.out.println(a);
            System.out.println(b);
        }
          //declared main method
        public static void main(String[] args){
                Method1();

       }
    }
