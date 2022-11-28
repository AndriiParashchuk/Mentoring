package com.javaStrings;

public class substring {
    public static void main(String[] args) {


//substring() Without End Index
        String str1 = "program";

        // from the first character to the end
        System.out.println(str1.substring(0));  // program


        // from the 4th character to the end
        System.out.println(str1.substring(3));  // gram


        //substring() With End Index
        String str2 = "program";

        // from 1st to the 7th  character
        System.out.println(str2.substring(0, 7));  // program

        // from 1st to the 5th  character
        System.out.println(str2.substring(0, 5));  // progr


        // from 4th to the 5th character
        System.out.println(str2.substring(3, 5));  // gr

    }
}
