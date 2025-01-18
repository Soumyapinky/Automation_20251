package Jan18;

public class Lab022 {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; //65
        int ss = s+c;
        System.out.println(ss);
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss


        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

        long phoneno = 9798654985l;
        short s1= (short) phoneno;
        System.out.println(s1);

        int course = 100;
        float GST = 18.45F;
       // int total_price1 = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);

    }
}
