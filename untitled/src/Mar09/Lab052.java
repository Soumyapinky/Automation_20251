package Mar09;

public class Lab052 {
    public static void main(String[] args) {
        // dataType[] arrayName;
        // Data Types
        // Primitive
        //  byte, short, int, long, double, float, char, boolean
        // Non Primitive
        // String, Class, enum

        int[] marks_10_board1 = {90, 91, 95, 99, 100, 78};
        float[] gst_pad = {18.45f, 91.87f, 95.78f, 99.00f, 100.00f, 78.98f};
//        int[] marks_10_board = [90, 91, 95, 99, 100, 78]; - Not possible
        String shoppling_list[] = {"bread", "butter", "milk", "curd"};

        // int[] marks_12_board = {95,96,94,91,"Pramod"};
        char [] grades = {'A','B','C','D','E','F'};
        char [] grades_small = {'a','c','C','D','e','F', '#','@','%'};
        // camelCase = pramoddutta -> pramodDutta
        // greetme -> greetMe
        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // len -> 6
        // who index - 3 ->
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);
    }
}
