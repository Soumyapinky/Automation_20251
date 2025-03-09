package Jan18;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner max = new Scanner(System.in);
        System.out.println("enter the num");
        int num1 = max.nextInt();
        System.out.println("enter the num2");
        int num2 = max.nextInt();

        if(num2>num1)
        {
            System.out.println("true");

        }else if(num1>num2) {
            System.out.println("false");
        }else {
            System.out.println("equal");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println(age);
    }
}
