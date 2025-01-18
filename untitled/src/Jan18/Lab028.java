package Jan18;

public class Lab028 {
    public static void main(String[] args) {
        String s1 = "soumya";
        //String s1 = "s o u m y a";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("pinky");
        System.out.println(s1);
        // Non Primitive Types - String, Arrays, Class, ENUM.. more will come
        String password ="Password@123";
        String pass_U = password.toLowerCase();
        System.out.println(pass_U);
        System.out.println( password== pass_U);
        System.out.println(password.equals(pass_U));
        System.out.println(password.equalsIgnoreCase(pass_U));
        System.out.println(password.subSequence(1,3));
        System.out.println(password.indexOf('o'));
        System.out.println(password.length());
        System.out.println(pass_U.length());
    }
}
