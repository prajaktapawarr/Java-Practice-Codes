//program to find out whether student is pass or fail if it requires total 40% and at least 33% in each subject to pass take input from user
package com.company;
import java.util.Scanner;
public class praj_practice {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("marks in physics:");
        m1 = sc.nextByte();
        System.out.println("marks in chemistry:");
        m2 = sc.nextByte();
        System.out.println("marks in maths:");
        m3 = sc.nextByte();
        float avg = m1+m2+m3/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ){
            System.out.println("You are passed!");
        }
        else{
            System.out.println("Sorry!You are failed.");
        }


    }

    }
