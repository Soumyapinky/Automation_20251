package Jan18;

public class Lab027 {
    public static void main(String[] args) {
        final String API_TOKEN = "0a9s890ds98ds9";
        String BROWSER = "chrome";
        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4= str1.concat(str2); // Hello Guys
        // SCAP -  4
        //both are one string is created no new string for same value
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (OA)
//= Check for the Ref and .equals check for content
//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        //locations is different so false
        System.out.println(name1.equals(name2)); // Check for the Content

        String s1 = new String("pramod");
        String s2 = new String("pramod");
        String s3 = new String("pramod");

//locations is different so false
        System.out.println(s1 == s2); // Check for the ref
        System.out.println(s2 == s3); // Check for the ref
        //true location is same
        System.out.println(s2.equals(s3)); // Check for the Content
    }


}
