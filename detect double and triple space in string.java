package com.company;
public class praj_practice {
    public static void main(String[] args){
       String string = "This string contains  double and   triple spaces";
        System.out.println(string.indexOf("  "));
        System.out.println(string.indexOf("   "));
        //if there is no double or triple space, it will return -1
    }
}
