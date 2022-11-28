package com.javaStrings;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "LEARN JAVA";
        String str2 = "Learn jAva";

        // if str1 and str2 are equal (ignoring case differences),
        // the result is true
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str1 and str2 are not equal");
        }
        // str1 and str2 are equal
    }
}
