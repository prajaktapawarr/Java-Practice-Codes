package com.company;
import java.util.*;
public class Input_ScannerClass {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
