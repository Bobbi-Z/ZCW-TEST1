package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firstEl = stringArray[0];
        //creating a string out of the first element of the array at index 0

        return firstEl;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String secondEl = stringArray[1];
        // creating a string out of te second element of the array at index 1
        return secondEl;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
       String lastEl = stringArray[stringArray.length -1];
       //creating a string out of the last element of the array by finding
        // the last index which is 1 less than the length

        return lastEl;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
       String secondFromLast = stringArray[stringArray.length - 2];
       //creating a string out of the second to last element of the array by finding
        //the second to last index which is 2 less than the length
        return secondFromLast;
    }
}
