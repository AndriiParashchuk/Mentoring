package com.javaStrings;

public class replace {
    public static void main(String[] args) {

        // replace() Characters
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));  // zbc cbz

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));  // Java

        // character not in the string
        System.out.println("Hello".replace('4', 'J'));  // Hello
        //If the character to be replaced is not in the string, replace() returns the original string.



        //replace() Substrings
        String str = "C++ Programming";

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str.replace("C++", "Java"));  // Java Programming


        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java
        // If the substring to be replaced is not in the string, replace() returns the original string.

    }
}
