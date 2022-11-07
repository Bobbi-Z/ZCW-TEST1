package com.zipcodewilmington.assessment1.part2;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int objectCounter = 0;
        for (int index = 0; index < objectArray.length; index++){
            //moving through an array from o to the end increasing the index by 1 each time
            if (objectToCount == objectArray[index]) {
                //if the object at the current array index equals the object we're looking for
                objectCounter += 1;
                //count it
            } else {
                //skip it
                continue;
            }
        }
        return objectCounter;
        //once loop is finished the counter will have counted how many times the object appeared
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object [] removeValue(Object[] objectArray, Object objectToRemove) {
       ArrayList<Object> resultList = new ArrayList<>();
       // create an arraylist
        for (Object element : objectArray) {
            // for each element in the object array
            if (!element.equals(objectToRemove)) {
                //if the element at the current index does not match the object we're looking to
                //remove
                resultList.add(element);
                //add the element to the new array list
            }
        }
        return resultList.toArray(new Integer[0]);
        //sending the resulting array list to a array
    }

     /*   Object [] newobjectArray = new Object[objectArray.length - 1];
        for (int index = 0, newIndex = 0; index < objectArray.length; index++) {
            if (objectArray[index] == objectToRemove) {
                continue;
            } else {
                newobjectArray[newIndex++] = objectArray[index];
            }
        }
        return newobjectArray;
    }
*/
    //I HAVE SEEN THIS WORK ON A LAB BEFORE< SAME EXACT QUESTION
    // THE TEST IS NOT RUNNING RIGHT BUT WE ARENT ALLOWED TO FIX

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        //sorting the array by object - in this case integer
        Object mostPop = objectArray[0];
        //setting the most popular object to the first object in the array
        int mostPopCount = 1;
        //starting the counts at 1 - cant be less than 1
        int currentObCount = 1;
        for (int index = 1; index < objectArray.length; index++) {
            //moving through the array, starting at 1 to avoid error
            if (objectArray[index] == objectArray[index - 1]) {
                //if the array at the current index is the same ad the object at the
                //previous index
                currentObCount += 1;
                //mark the counter
            } else { // if the object at the current index is NOT the same as the object
                //at the previous index
                if (currentObCount > mostPopCount) {
                    // check to see if at the current count is higher than the pop count
                    mostPopCount = currentObCount;
                    // if that's true make the pop count equal to the current count
                    mostPop = objectArray[index - 1];
                    //whatever object was at the previous index is currently the most popular
                }
                currentObCount = 1;
                //otherwise if the current less than or equal to the most pop
                // set the current count back to 1
            }
            if (currentObCount > mostPopCount) { //at the end evaluating to see if the final
                //object was the most popular
                mostPopCount = currentObCount;
                //if so set them to equal
                mostPop = objectArray[index - 1];
                // setting the final object to the most popular
            }
        } return mostPop;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
       Arrays.sort(objectArray);
       //sort array by object
        Object leastPop = objectArray[objectArray.length-1];
        //setting the least pop to the last object in the array
        int minCount = objectArray.length + 1;
        //setting the min count higher than the array length so it can get modified down
        int currentCount = 1;
        //starting the current count at 1; it cannot be lower than this
        int indexO;
        for (indexO = 1; indexO < objectArray.length; indexO++){
            //looping through the array length starting at index 1 so that we can check
            // 1 vs 0 w/o causing error and increasing the index by 1
            if (objectArray[indexO] == objectArray[indexO-1]){
                //if the object of the current index is the same as the previous index
                currentCount +=1;
                //count it
            }else{ //if they are not the same
                if (currentCount < minCount){
                    //check to see if the current count is less than the minimum count
                    minCount = currentCount;
                    //if thats true set them to equal
                    leastPop = objectArray[indexO-1];
                    //which means the object at the previous index is the least pop so far so
                    //set it
                }
                currentCount = 1;
                //if they are not the same set the current count back to 1 and move on
            }
        }
        if (currentCount < minCount) {
            //one last check to see if the object at the last array is actually the least pop
            minCount = currentCount;
            //if it is set the min count to the current count
            leastPop = objectArray[objectArray.length - 1];
            //reset the least pop to the object at the last index
        }
     return leastPop;

    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */

    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> newObjectArray = new ArrayList<>();
        //new array list to add 1st array to
        newObjectArray.addAll(Arrays.asList(objectArray));
        //adding first array as a list to the new list
        ArrayList<Object> newObjectArrayToAdd = new ArrayList<>();
        //new array list to add the 2nd array to
        newObjectArrayToAdd.addAll(Arrays.asList(objectArrayToAdd));
        //adding second array to the list
        newObjectArray.addAll(newObjectArray.size(), newObjectArrayToAdd);
        //adding the second list to the fist
        Integer [] mergedArray = newObjectArray.toArray(new Integer[0]);
        //converting the merged lists back to an array

        return mergedArray;
    }
}
