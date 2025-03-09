package Jan18;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        // Take user input and check if number id even or odd.



        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input


        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)
        Scanner Input = new Scanner(System.in);// obect of the scanner Class - OOPs
        System.out.println("enter the num");
        int user_input = Input.nextInt();
        System.out.println(user_input);
        if (user_input%2==0)
        {
            System.out.println("even");

        }else
            System.out.println("odd");

    }
}
