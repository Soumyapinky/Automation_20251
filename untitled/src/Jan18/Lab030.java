package Jan18;

public class Lab030 {
    public static void main(String[] args) {
        // Condition and Loops
        //
        // Condition ?
        // age  > 18 -> you allowed to / Vote
        //
        //  if age > 18 -> vote, else -> not allowed.

        // Condition - Java -> switch , If
        // syntax
//        if (condition ==> true or false){
//
//        }else{
//
//        }

        int age = 35;
        if (age > 18) {
            System.out.println("Allowed to Vote!!");
        } else {
            System.out.println("Not allowed!!");
        }

        int a = 10;
        if (a==4)
        {
            System.out.println("correct");

        }else {
            System.out.println("incorrect");
        }
        boolean b = !true;
        if(b){
            System.out.println("b is true");
        }else {
            System.out.println("b is not true");
        }
        boolean a1 = true;
        a1 = !a1;
        if(2+2 < 4){
            System.out.println("Inside the loop");
        }
        System.out.println("Outside -> "+a1);
        // Understand with debug -> checking the code line by line
        int num = 11;
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }



}



