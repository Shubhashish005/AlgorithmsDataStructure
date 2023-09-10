package org.hackerearth;

public class CandiesStuffThemInProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 1, 3};
        int numberOfExtraCandles = 3;

        int[] result = maximumNumber(arr, numberOfExtraCandles);
        for (int rs: result) {
            System.out.println(rs);
        }
    }

    private static int[] maximumNumber(int[] arr, int numberOfExtraCandles) {
        int[] result = new int[arr.length];
        int maximum = 0;
        for (int x: arr) {
            if(x > maximum)
                maximum = x;
        }
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
          if(arr[i] + numberOfExtraCandles >= maximum){
                result[i] = 1;
            }else
                result[i] = 0;
        }

        return result;
    }
}
