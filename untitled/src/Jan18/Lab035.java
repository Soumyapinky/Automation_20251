package Jan18;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browserName = sc.next();
        switch (browserName.toLowerCase())
        {
            case "chrome":
                System.out.println("launch the chrome browser");
                break;
            // Further code to start the Chrome
            // Webdriver driver = new Chrome(); // Selenium Code
            case "edge":
                System.out.println("launch the chrome browser");
                break;
            case "firefox":
                System.out.println("launch the chrome browser");
                break;

        }
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter thr Char");
        char User_input = sc1.next().charAt(0);
        switch (User_input)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;

        }
        System.out.println("out the Vowel");
 int a =65;
 switch (a)
 {

 }
 char c='A';
 switch (c)
 {

 }
 // boolean is not supported in switch
// boolean b = true;
// switch (b)
// {
//
// }
        int a1 = 98;
        switch (a1) {
            case 98:
                System.out.println("Val - 98");
//            case 98:
//                System.out.println("Val - 98");
    }
}
}
