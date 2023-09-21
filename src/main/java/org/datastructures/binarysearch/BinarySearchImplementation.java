package org.datastructures.binarysearch;

import java.util.Scanner;

public class BinarySearchImplementation {
    public static void main(String[] args) {

        int[] arr = new int[]{2,4,6,9,11,12,14,20,36,48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();

        int targetLocation = returnTargetIndex(arr, target);
        System.out.println("targetLocation : " + targetLocation);

    }

    private static int returnTargetIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else
                return mid;
        }

        return -1;
    }
}
