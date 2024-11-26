package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class praj_SwitchCase {
    public static void main(String[] args){
        int marks;
        System.out.println("enter your marks:");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        switch (marks){
            case 90:
                System.out.println("you will be qualified");
                break;
            case 75:
                System.out.println("you are semi-qualified ");
                break;
            case 34:
                System.out.println("you are not qualified");
                break;
            default:
                System.out.println("you will get chance next time");
            }
        }


    }

