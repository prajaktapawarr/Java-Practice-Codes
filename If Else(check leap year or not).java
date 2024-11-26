//java program to find out the day of the week given the number[1 for monday and so on!]

package com.company;
import java.util.Scanner;

public class praj_practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Yes, this is a leap year ");
        } else {
            System.out.println("No, this is not a leap year");
        }

    }
}