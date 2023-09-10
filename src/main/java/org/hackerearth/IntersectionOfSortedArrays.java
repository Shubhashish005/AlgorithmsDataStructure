package org.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.
 */
public class IntersectionOfSortedArrays {
    
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(1,2,5,7,9);
        List<Integer> list3 = List.of(1,3,4,5,8);

        List<Integer> resultList = intersectionOfArrays(list1, list2, list3);
        System.out.println(resultList);
    }

    private static List<Integer> intersectionOfArrays(List<Integer> array1, List<Integer> array2, List<Integer> array3) {

        int arr_pos1 = 0;
        int arr_pos2 = 0;
        int arr_pos3 = 0;
        List<Integer> resultList = new ArrayList<>();

        while (arr_pos1 < array1.size() && arr_pos2 < array2.size() && arr_pos3 < array3.size()){
            int array1_element = array1.get(arr_pos1);
            int array2_element = array2.get(arr_pos2);
            int array3_element = array3.get(arr_pos3);
            if(Objects.equals(array1_element, array2_element) && Objects.equals(array2_element, array3_element)){
                resultList.add(array1_element);
                arr_pos1++;
                arr_pos2++;
                arr_pos3++;
            }else if (array1_element <= array2_element && array1_element <= array3_element){
                arr_pos1++;
            } else if (array2_element <= array1_element && array2_element <= array3_element) {
                arr_pos2++;
            } else
                arr_pos3++;
        }

        return resultList;
    }
}
