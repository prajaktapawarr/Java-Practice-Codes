package com.company;

public class praj_strings {
    public static void main(String[] args){
        String st = "Prajakta";
        String a = new String("Prajakta");
        System.out.println(a);
        int c = 4;
        float b = 4.3f;
        System.out.printf("The value of c is %d and b is %f",c,b);
        System.out.println(".");
        String name = "Prajakta";
        int value = name.length();
        System.out.println(value);
        String lstring = "Prajakta";
        System.out.println(lstring.toLowerCase());
        String ustring = "Prajakta";
        System.out.println(ustring.toUpperCase());
        String nontrimmedstring = "  Prajakta  ";
        System.out.println(nontrimmedstring);
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);
        System.out.println(name.substring(5));
        System.out.println(name.substring(4,5));
        System.out.println(name.replace('a', 'k'));
        System.out.println(name.replace("akta", "u"));
        System.out.println(name.startsWith("Pr"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.endsWith("k"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("P"));
        System.out.println(name.indexOf("j",2));
        System.out.println(name.lastIndexOf("k"));
        System.out.println(name.lastIndexOf("P" , '3'));
        System.out.println(name.equals("Prajakta"));
        System.out.println(name.equalsIgnoreCase("PraJAKTA"));
        System.out.println("The value of: \n p is 2");//Escape Sequence Character


    }


}
