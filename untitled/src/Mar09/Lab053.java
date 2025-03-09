package Mar09;
import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {

        // Arrays -> new
        int[] marks = new int[3];
        // index - 0,1,2
        // len - 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]); // AIOBE


        boolean[] is_married = {true, false, true};
        // To Print

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
        }


        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }

            int[] numbers = {10, 20, 30, 40, 50};
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i] * 2);

                // len -> 5
                // index -> 0, 1,2,3,4
                //  // i = 0,1,2,3,4
                // i = 0   10*2 ->   20
                // i = 1   20*2 ->   40
                // i = 2   30*2 ->   60
                // i = 3   40*2 ->   80
                // i = 4   50*2 ->   100
                // 20,40,60,80,100
                int[] a = new int[4];
                a[3] = 90;
                System.out.println(a[2]);
                System.out.println(a[3]);
                System.out.println(a[0]);
                final int[] ages = new int[4];
                ages[3] = 78;
                System.out.println(ages[3]);

                final int b = 10;
                //b = 90;
                final float pi =  3.14F;

                // Disadvantage of array
                //1. Fixed Data Type (homo)
                //2.  Fixed Length.
                // 3. wastage of memory
                int [] ages1 = new int[100];
                ages[1]  = 99;
                ages[1]  = 100;
                System.out.println(ages[1]); // 0 99 00000000...



            }
    }
}
