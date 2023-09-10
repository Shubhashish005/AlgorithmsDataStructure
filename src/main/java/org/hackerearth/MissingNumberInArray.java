package org.hackerearth;

/*
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
Note: There are no duplicates in the list.
 */
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1};
        int n = 4;

        int missingNumber = missingNumber(arr, n);
        System.out.println(missingNumber);
    }

    private static int missingNumber(int[] arr, int n) {
        int total = n * (n+1)/2;
        int arrSum = 0;

        for (int x: arr) {
            arrSum = arrSum + x;
        }

        return total - arrSum;
    }
}
