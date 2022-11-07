package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
       int sum = 0;
       for (int index = 0; index < intArray.length; index++)
           //looping through the array stating at index 0 and ending
           // at the end increasing by 1 every time
           sum += intArray[index];
       //everytime the loop runs through it adds the integer at the current index to a
        //total sum via sum = sum + 'integer at current index'
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        //have to start a 1 otherwise it will perpetually be 0. anything time 0 = 0
        for (int index = 0; index < intArray.length; index++)
            //looping through an array from 0 to the end increasing by 1
            product = product * intArray[index];
        //everytime the loop runs through it multiplies the current product by the next
        //int
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        for (int index = 0; index < intArray.length; index++){
            //looping through array from 0 to end increasing by 1
            sum += intArray[index];
            //getting the sum of all of the ints in the array
        }
        double average = sum / (intArray.length - 1);
        //
        return average;
    }
}
