
package com.company;
import java.util.Scanner;
public class Infosys {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = 5;

                long factorial = calculateFactorial(number);

                if (factorial == -1) {
                    System.out.println("Factorial is not defined for negative numbers");
                } else {
                    System.out.println("Factorial of " + number + " is: " + factorial);
                }

                scanner.close();
            }

            public static long calculateFactorial(int n) {
                if (n < 0) {
                    return -1; // Factorial is not defined for negative numbers
                } else if (n == 0 || n == 1) {
                    return 1;
                } else {
                    long result = 1;
                    for (int i = 2; i <= n; i++) {
                        result *= i;
                    }
                    return result;
                }
            }
        }






