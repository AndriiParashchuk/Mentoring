package com.javaStrings;

public class charAt {
    public static void main(String[] args) {

        String str1 = "Learn Java";
        String str2 = "Learn\nJava";

        // first character
        System.out.println(str1.charAt(0));  // 'L'

        // seventh character
        System.out.println(str1.charAt(6));  // 'J'


        // sixth character
        System.out.println(str2.charAt(5));  // '\n'

//In Java, the index of Strings starts from 0, not 1.
// That's why chartAt(0) returns the first character.
// Similarly, charAt(5) and charAt(6) return the sixth and seventh character respectively.
    }
}
