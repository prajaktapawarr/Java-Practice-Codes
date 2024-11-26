package com.company;

import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        System.out.println("Enter the kilometers to be converted in miles:");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float miles = km * 0.621371f;
        System.out.println(miles);

    }

}
