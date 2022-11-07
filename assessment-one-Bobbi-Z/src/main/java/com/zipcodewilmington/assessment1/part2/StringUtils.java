package com.zipcodewilmington.assessment1.part2;

import org.apache.commons.lang3.*;
/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence,
     * return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] sentenceArray = org.apache.commons.lang3.StringUtils.split(sentence, " ");
        //separates a string into a string array based on spaces
        return sentenceArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        sentence = org.apache.commons.lang3.StringUtils.substringBefore(sentence, " ");
        //returning the first word of a string by getting a substring from the 1st space
        return sentence;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        sentence = org.apache.commons.lang3.StringUtils.substringBefore(sentence, " ");
        //returning first word of a string by getting a substring from the first space
        sentence = org.apache.commons.lang3.StringUtils.reverse(sentence);
        //reversing the chars in the new substring
        return sentence;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        sentence = org.apache.commons.lang3.StringUtils.substringBefore(sentence, " ");
        //first word by substring from first space
        sentence = org.apache.commons.lang3.StringUtils.reverse(sentence);
        //reversing first word
        sentence = org.apache.commons.lang3.StringUtils.capitalize(sentence);
        //applying capitalization rules to first string

        return sentence;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        str = org.apache.commons.lang3.StringUtils.remove(str, str.charAt(index));
        //removing a character at a specified index within a string
        return str;
    }

}
