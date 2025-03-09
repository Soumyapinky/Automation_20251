package Jan18;
import java.util.Scanner;
public class Lab050 {

        // For and if

        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Max number");
            int n = sc.nextInt();


            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
            //Functions
            // Block of code which we can reuse.
            // Pre-built
            // User created / defined
            int result = Math.max(3,4);
            int result2 = Math.max(10,12);
            System.out.println(result);
            System.out.println(result2);
            // Functions
            // Block of code which we can reuse.
            // 1. Pre-built - Math.max()
            // 2. User created / defined

            // Two component of the functions
            // 1. Define
            // 2. Call the function


            // Call the function
            for (int i = 0; i < 5; i++) {
                greet();
            }

            greet2();

        }

//void means no return
    // 1. Define
    static void greet(){
        System.out.println("Hi, How are you?");
    }

    static void greet2(){
        System.out.println("greet2");
    }
        }

