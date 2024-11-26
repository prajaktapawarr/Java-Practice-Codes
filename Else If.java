package com.company;
import java.util.Scanner;
public class praj_ElseIf {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
         age = sc.nextInt();
         if(age>56){
             System.out.println("you are experienced");
         }
         else if (age>46) {
             System.out.println("you are semi experienced!");
         }
         else if (age>34) {
             System.out.println("you are semi-semi experienced!");
         }
         else{
             System.out.println("you are not experienced!");
         }


    }
}
