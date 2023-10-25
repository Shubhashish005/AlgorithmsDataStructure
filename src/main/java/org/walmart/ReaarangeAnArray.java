package org.walmart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an array of elements of length N, ranging from 0 to N – 1.
All elements may not be present in the array.
If the element is not present then there will be -1 present in the array.
Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 */
public class ReaarangeAnArray {

    public static void main(String[] args) {
        int[] A = {-1, -1, 6, 1, 9,
                3, 7, -1, 4, -1};

        // Function calling
        System.out.println(Arrays.toString(fixTheArray(A)));
    }

    private static int[] fixTheArray(int[] inputArray) {

        Set<Integer> numberSet = new HashSet<>();
        for (int value : inputArray) {
            numberSet.add(value);
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (numberSet.contains(i))
                inputArray[i] = i;
            else
                inputArray[i] = -1;
        }

        return inputArray;

    }
}
