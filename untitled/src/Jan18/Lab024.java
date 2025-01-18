package Jan18;

public class Lab024 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13

        int a1 = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        //System.out.println(s1+s2+a1+b);
        System.out.println(s1+s2+(a1+b));
        //System.out.println(KK+vv+87+91);

    }
}
