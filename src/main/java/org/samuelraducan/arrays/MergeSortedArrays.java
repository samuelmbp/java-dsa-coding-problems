package org.samuelraducan.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 Develop a function that merges two pre-sorted arrays into a single sorted array.
 
Example 1:   

Input:
array1 = [1, 3, 5, 7]
array2 = [2, 4, 6, 8]
Output: mergedArray = [1, 2, 3, 4, 5, 6, 7, 8]

Example 2:

Input:
array1 = [10, 20, 30]
array2 = [5, 15, 25, 35]
Output: mergedArray = [5, 10, 15, 20, 25, 30, 35]

Example 3:

Input:
array1 = [1, 1, 1]
array2 = [2, 2, 2]
Output: mergedArray = [1, 1, 1, 2, 2, 2]
 */

public class MergeSortedArrays {
    
    public static List<Integer> mergeArrays(List<Integer> array1, List<Integer> array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }

        if (array1.isEmpty()) {
            return array2;
        }

        if (array2.isEmpty()) {
            return array1;
        }

        List<Integer> mergeArrays = new ArrayList<>(array1);
        mergeArrays.addAll(array2);

        mergeArrays.sort(Comparator.naturalOrder());

        return mergeArrays;
    }

    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> array2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> mergedArrays = mergeArrays(array1, array2);
        System.out.println(mergedArrays); // Output: [1, 2, 3, 4, 5, 6, 7, 8]


        // Error Output
        List<Integer> array3 = null;
        List<Integer> array4 = List.of(1, 2, 3, 4);

        try {
            List<Integer> result = mergeArrays(array3, array4);
            System.out.println("Merged Array: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
