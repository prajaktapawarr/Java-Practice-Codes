
package com.company;
import java.util.Scanner;
public class Infosys {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of elements in the sequence: ");
                int n = scanner.nextInt();

                displayGeometricSequence(n);

                scanner.close();
            }

            public static void displayGeometricSequence(int n) {
                int term = 1; // First term of the sequence

                for (int i = 0; i < n; i++) {
                    System.out.print(term + " ");
                    term *= 2; // Each term is double the previous term
                }

                System.out.println(); // Move to the next line after the sequence
            }
        }








