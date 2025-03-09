package Jan18;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1");
        int Value1 = sc.nextInt();
        System.out.println("Enter the value2");
        int Value2 = sc.nextInt();
        System.out.println("Enter the value3");
        int Value3 = sc.nextInt();
        if(Value1 >= Value2 && Value1 >= Value3){
            System.out.println(Value1);

        } else if (Value2>=Value1 && Value2 >= Value1) {
            System.out.println(Value2);
            
        }else {
            System.out.println(Value3);
        }

    }
}
