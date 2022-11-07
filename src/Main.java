public class Main {

    //Primitive Data types
    static boolean b = true;
    static char c = 'A';
    static int a = 10;
    static short s = 2;
    static byte bt =6;
    static long l = 12344373897l;

    static float f = 65.20298f;
    static double d=876.765d;

    public static void main(String[] args) {

        displayMessage();
        strEqual();
        primitiveDataTypes();
    }

    //Display Message
    public static void displayMessage(){
        System.out.println("Hello World!");
        System.out.println("Message");
    }

    //Strings are equal
    public static void strEqual() {
        String s1 = "Java";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    //Primitive Data Types
    static void primitiveDataTypes(){
        System.out.println("==========================");
        System.out.println("Value of boolean is "+b);
        System.out.println("Value of char is "+c);
        System.out.println("Value of int is "+a);
        System.out.println("Value of short is "+s);
        System.out.println("Value of byte is "+bt);
        System.out.println("Value of long is "+l);
        System.out.println("Value of float is "+f);
        System.out.println("Value of double is "+d);
        System.out.println("Value of boolean is "+b);
        System.out.println("==========================");
    }
}