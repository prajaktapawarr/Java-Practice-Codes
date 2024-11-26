package com.company;

public class praj_practice {
    public static void main(String[] args){
        //encrypting grade
        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);
        //decrypting grade
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
