package com.company;
import java.util.Scanner;
public class praj_takinginput  {
    public static void main(String[] args){
        System.out.println("Submit the marks in each subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks obtained in Physics:");
        float Physics = sc.nextFloat();
        System.out.println("Marks obtained in Chemistry:");
        float Chemistry = sc.nextFloat();
        System.out.println("Marks obtained in Maths:");
        float Maths = sc.nextFloat();
        System.out.println("Marks obtained in Biology:");
        float Biology = sc.nextFloat();
        float total = Physics+Chemistry+Maths+Biology;
        float percentage = (total/400)*100;
        System.out.print(percentage);
        System.out.println("%");



    }
}
