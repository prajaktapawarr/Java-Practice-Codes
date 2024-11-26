package com.company;
import java.util.Scanner;

public class user_enters_1_then_keep_taking_input_for_marks_If_they_enter_0_then_stop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as Well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to Continue? Yes(1) or No(0)");
            input = sc.nextInt();
        } while(input == 1);
    }
}



