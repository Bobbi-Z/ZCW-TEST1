package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part2.StringUtils;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer palindromeCount = 0;
        //counter to count the number of palindromes
        for (int i = 0; i < input.length(); i++) {
            //looping through the string
            for (int j = i + 1; j <= input.length(); j++) {
                //looping through the string 1 ahead in order to create substring and compare
                if (input.substring(i, j).equals(StringUtils.reverseFirstWord((input.substring(i, j))))) {
                    //create substring between i and j & compare it to that substring reversed
                    palindromeCount++;
                    //if true count as a palindrome
                }
            }
        }
        return palindromeCount;
    }
}

