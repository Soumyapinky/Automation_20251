package Jan18;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your salary");
        double salary = sc.nextDouble();
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("sal"+salary);

    }
}
