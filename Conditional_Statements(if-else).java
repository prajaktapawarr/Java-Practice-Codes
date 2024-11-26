package com.company;
import java.util.*;
public class Conditional_Statements {
    public static void main(String[] args) {
        //if-else
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Is Adult");
        } else {
            System.out.println("Is Not Adult");
        }
    }
}

