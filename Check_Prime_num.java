package com.company;
import java.util.Scanner;

public class Check_Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (n <= 1) {
            System.out.println("This is neither prime nor composite");
        } else if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}











