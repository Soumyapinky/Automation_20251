package Jan18;

import java.util.Locale;

public class Lab025 {
    public static void main(String[] args) {
        String name = "Pramod";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
       // System.out.println(name.charAt(10)); // Exception Index 10 out of bounds

        String name1 = "Pramod"; // Assignment Operators
        String name3 = new String("Pramod"); // New Operator

        // Both of them, actually save the name, name2 in different ways JVM
        // How they store the values in the JVM?


        // SCP(string constant pool) nad Heap - JVM
//string are immuteable
        String s1 = "Pramod";
        // 1 , SCP
        s1 = "Amit";
        // 2 , SCP
        s1 = "Dutta";
        // 3 . SCP
        s1 = "Pramod";
        // 3, SCP
        String s = new String("Pramod");
        String s2 = new String("Pramod");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Pramod

    }
}
