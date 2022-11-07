package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> intArrayList = new ArrayList <>();
        //creating an array list so that its mutable
        intArrayList.addAll(Arrays.asList(ints));
        //adding the ints array as a "list" to the array list
      for (int i = 0; i < intArrayList.size(); i++)
          //looping through the array list
          if (intArrayList.get(i) % 2 == 0){
              //must use .get() to retrieve index
              //if the int at the current index modulo 2 equals 2
              intArrayList.remove(i);
              //remove it leaving only the odds
          }

  Integer [] newInts = new Integer[intArrayList.size()];
          //creating a new array to add the arraylist to - must be the same size as the list
          newInts = intArrayList.toArray(newInts);
        //  sending the array list into the new array

        return newInts;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> intsAL = new ArrayList<>();
        //creating a new array list to add the array into
        intsAL.addAll(Arrays.asList(ints));
        //converts int array to a unmutable list then adds it to the newly created list
        for (int index = 0; index < intsAL.size(); index++)
            //looping through the array list
            if (intsAL.get(index) % 2 != 0){
                //using .get to retrieve the index if the int at the current index
                //modulo 2 does not equal 0 the number is odd and we dont want it so...
                intsAL.remove(index);
                //remove it
            }
        Integer [] oddInts = new Integer[intsAL.size()];
            //creating an new array the size of the array list to pass the list to
            oddInts = intsAL.toArray(oddInts);
            //adding array list to array

        return oddInts;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%3 == 0) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }
        return result;

        //        ArrayList<Integer> intsAL = new ArrayList<>();
//        //creating an array list to pass the array int
//        intsAL.addAll(Arrays.asList(ints));
//        //converting array to unmutable list then adding to the mutable list
//        for (int index = 0; index < intsAL.size(); index++) {
//            //looping through the index list from 0 to the end increasing by 1
//            if (intsAL.get(index) % 3 == 0) {
//                //if the int at the current index modulo 3 is equal to 0 then the number
//                //is divisible by 3 and we don't want it.
//                intsAL.remove(index);
//                //remove it
//
//            }
//        }
//
//        Integer [] noMultiplesOf3 = new Integer[intsAL.size()];
//            //creates a  integer array the same size as the list
//        noMultiplesOf3 = intsAL.toArray(noMultiplesOf3);
//        //sens the list to the array
//    return noMultiplesOf3;
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%multiple == 0) {
                ints[i] = -1;
            }
        }
        Integer[] result = new Integer[ints.length - ArrayUtils.getNumberOfOccurrences(ints, -1)];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != -1) {
                result[count] = ints[i];
                count ++;
            }
        }

        return result;
    }




//       ArrayList<Integer> intsAsList = new ArrayList<>();
//       //creating a list to pass the array into
//        intsAsList.addAll(Arrays.asList(ints));
//        //passing the array to a unmutable list then to a mutable list
//        for (int index = 0; index < intsAsList.size(); index++) {
//            //looping through array list
//            if (intsAsList.get(index) % multiple == 0) {
//                intsAsList.remove(index);
//            }
//        }
//       Integer [] backToArray = new Integer[intsAsList.size()];
//        backToArray = intsAsList.toArray(backToArray);
//
//        return backToArray;
//    }
}
