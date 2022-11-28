package com.javaStrings;

public class length {
    public static void main(String[] args) {

        // length()
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

// the length of "Java\n" string is 5 instead of 6.
// It is because \n is a single character (newline) in Java

    }
}
