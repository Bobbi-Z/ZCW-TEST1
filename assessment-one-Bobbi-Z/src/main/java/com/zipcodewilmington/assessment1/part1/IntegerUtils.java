package com.zipcodewilmington.assessment1.part1;



/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
       int sumOfN = 0;
       for (int x = 1; x <= n; x++) {
           //looping through all numbers from 1 to the given increasing by 1 each time
           sumOfN += x;
           //adding each integer from 1 to n together
       }
        return sumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int factorial = 1;
        for (int x = 1; x<= n; x++){
            //looping through all the integers from
          factorial = factorial * x;
        }
        return factorial;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

      int reversedVal = 0;
      //creating a new val
    while (val > 0){
        //as long as val is greater than 0
       reversedVal = reversedVal * 10 + val % 10;
        //the 10 modulo of the given value will return the last digit of the int
        //multiplying it by 10 increases its place i.e. 5 becomes 50 moving it towards the
        //placing of the original staring digit of the number ALSO making it the front of
        //front of the number


       //reversedVal = 0 * 10 + 12345 % 10 = 5
        //reversedVal = 5 * 10 + 1234 % 10 = 54
        //reversedVal  = 54 * 10 + 123 % 10 = 543
        //reversedVal  = 543 * 10 + 12 % 10 = 5432
        //reversedVal = 5432 * 10 + 1 % 10 = 54321
        val = val/10;
        //dividing the value of the original given w/o the modulo reduces the "10's" position
        //and allows us to take the modulo of the new value passing it to the be the 2nd
        //digit instead of the 2nd to last digit

      // 12340 / 10 = 1234
        // 1230 / 10 = 123
        // 120 / 10 = 12
        // 10 / 10 = 1
    }
        return reversedVal;
    //rinse and repeat until all numbers have been moved from their original position
    }
}
