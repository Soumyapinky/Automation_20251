package Jan18;

public class Lab023 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

        // pre - increment ++operand
        // value is incremented first and then stored in the result.
//        int a = 10;
//        int b = ++a; // a = a+1;
//        // Exp = 11 , a = 11
//        System.out.println(a);
//        System.out.println(b);


//
//        int a = 10;
//        System.out.println(++a);
//        // Exp = 11 , a = 11


        // POST
        //  value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        // Exp = 10 , a = 11
        //        int a = 10;
//        int result = a++;
//        System.out.println(a);
//        System.out.println(result);
//
//        // Exp = 10 , a = 11?


        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Exp = 11 , a = 11?

        int a1 = 10;
        System.out.println(a1++ + a1);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11

        int b = 10;
        System.out.println(b++ + ++b);
        System.out.println(b);
        // A - a++  -> Exp = 10 | a = 11
        // + - operator
        // B- a++  -> Exp = 12 | a = 12
    }
}
