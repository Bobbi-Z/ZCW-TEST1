package com.zipcodewilmington.assessment1.part1;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = StringUtils.capitalize(str);
        //camel case is traditional capitalization; capitalizing the string
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
       str = StringUtils.reverse(str);
       //reversing the chars in the string
        return str;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       str = StringUtils.reverse(str);
       //reverse string
       String newStr = StringUtils.capitalize(str);
       //capitalize string
        return newStr;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
       str = StringUtils.substring(str, 1, (str.length() - 1));
       //creating a substring that stats at the 2nd char which is the index 1 and ending
        //at the and to last char which is the second to last index found by subtracting 1
        //from the length since the 1st bound is inclusive and the 2nd is exclusive
        return str;

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
       str = StringUtils.swapCase(str);
       //switching the upper and lowercase letters
       return str;

    }
}
