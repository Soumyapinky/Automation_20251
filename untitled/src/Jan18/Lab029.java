package Jan18;

public class Lab029 {
    public static void main(String[] args) {
        //  Ternary operator.
        //  ? if true do this : ele do that
//        int result = 10>40 ? 89 : 91;
//        System.out.println(result);
        int a1 = (30>40) ? 10: 20;
        System.out.println(a1);

        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);
        // Max between two numbers
        int a= 10;
        int b= 20;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);

        double sq = Math.sqrt(2);
        int result = Math.max(10,23);
        System.out.println(sq);
        System.out.println(result);
    }
}
