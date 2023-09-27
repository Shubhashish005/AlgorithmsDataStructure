package org.dynamicprogramming;

import java.util.Arrays;

public class Sort0And1ArrayElements {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        sort0and1InArray(arr);
    }

    private static void sort0and1InArray(int[] arr) {

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            if (arr[first] == 1) {
                if (arr[last] != 1){
                    arr[first] = arr[first] + arr[last];
                    arr[last] = arr[first] - arr[last];
                    arr[first] = arr[first] - arr[last];
                } else{
                    last--;
                }
            }else{
                first++;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
