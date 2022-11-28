package com.javaStrings;

public class replaceAll {
    public static void main(String[] args) {

        String str1 = "aabbaaac";
        String str2 = "Learn223Java55@";

        // regex for sequence of digits
        String regex = "\\d+"; // metacharacter in java (find a digit)

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "zz"));  // zzbbzzac


        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " "));  // Learn Java @

    }
}
