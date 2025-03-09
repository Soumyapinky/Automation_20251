package Jan18;

public class Lab046 {
    public static void main(String[] args) {
        // Loop with condition
        //
        for (int i = 1; i <= 10; i++) {
            // i from 1 to 10, 10 times
            if (i == 5) {
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }


        // 1
        //2
        //3
        //4
        //Five
        //6
        //7
        //8
        //9
        //10
        // Loop with condition
        //
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }


        }

        // i = 1 -> 1
        // i = 2 -> 2
        // i = 3 -> 3
        // i = 4 -> 4
        // i = 5 -> Out of loop
        for (int i = 0; i <=50 ; i++) {
            if (i % 2 == 0) {  //  if(i%2 != 0){
                System.out.println(i);
            }
        }
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;
            }
            System.out.println("After!!");
        }for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> "+ i);
        }
        for (int i = 1; i <= 100; i++) { // i = 1 to 100, times = 100
            System.out.println(i);
        }
    }
}
