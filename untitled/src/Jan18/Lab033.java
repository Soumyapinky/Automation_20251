package Jan18;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {
        //        ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59


        // 1. Find the user Inputs
        // score - data type? - int -90
        // return -> grade - data-type - char  - A
        //         // // DAA- Ask for the confirmation of the doubts
        // Interviewer ->  int, char
        // Scanner - >

        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else if score <=79 && score >= 70 -> return or orint grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        int Score = sc.nextInt();
        char grade = 'F';
        if (Score >= 90 && Score <= 100) {
            grade = 'A';
        } else if (Score >= 70 && Score <= 89) {
            grade = 'B';
        } else if (Score >= 60 && Score <= 79) {
            grade = 'C';
        } else if (Score > 50 && Score <= 59) {
            grade = 'D';
        } else {
            grade = 'F';

        }
        System.out.println("Your Grade is-> " + grade);
        sc.close();
        // if false it will not go into the loop
        if (false) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }}
