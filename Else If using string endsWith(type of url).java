//java program to find out type of website from url.

package com.company;
import java.util.Scanner;

public class praj_practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website.");

        }
    }
}
