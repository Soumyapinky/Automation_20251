package Jan18;

public class Lab017 {
    public static void main(String[] args) {
        // || - OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F
        System.out.println();
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
