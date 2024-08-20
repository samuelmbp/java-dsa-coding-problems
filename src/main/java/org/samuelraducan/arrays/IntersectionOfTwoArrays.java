package org.samuelraducan.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 Objective:
Given two arrays, find the elements that are common to both arrays. The result should only include unique elements that appear in both arrays, without duplicates.

Input:

Two arrays of integers, array1 and array2.
Output:

An array containing the unique elements that are present in both array1 and array2.
Examples:

Input:
array1 = [1, 2, 2, 3, 4]
array2 = [2, 2, 3, 5]

Output: [2, 3]

Input:
array1 = [7, 8, 9]
array2 = [10, 11, 7]
Output: [7]

Input:
array1 = [1, 2, 3]
array2 = [4, 5, 6]
Output: [] (no common elements)
Constraints:

The input arrays can contain duplicate elements, but the output should only include unique elements.
 */

public class IntersectionOfTwoArrays {
    
    public static Set<Integer> intersectionOfTwoArrays(
        List<Integer> listOne, List<Integer> listTwo
    ) {

        if (listOne == null || listOne.isEmpty() ||
            listTwo == null || listTwo.isEmpty()) {
            throw new IllegalArgumentException("Lists cannot be null or empty.");
        }

        // ======================
        /* FIRST SOLUTION */
        // ======================
        /*
        Set<Integer> listOneNoDuplicates = new HashSet<>(listOne);
        Set<Integer> intersectionOfIntegers = new HashSet<>();
        for (Integer number : listTwo) {
            if (listOneNoDuplicates.contains(number)) {
                intersectionOfIntegers.add(number);
            }
        }
        return intersectionOfIntegers; 
        */

        // ======================
        /* SECOND SOLUTION */
        // ======================
        return listOne.stream()
            .distinct()
            .filter(number -> listTwo.contains(number))
            .collect(Collectors.toSet());
            
    }

    public static void main(String[] args) {
        List<Integer> listOne = List.of(1, 2, 2, 3, 4);
        List<Integer> listTwo = List.of(2, 2, 3, 5);
        System.out.println(intersectionOfTwoArrays(listOne, listTwo)); // Output:[2, 3]


        // 7, 8, 9
        List<Integer> listThree = List.of(7, 8, 9);
        List<Integer> listFour = List.of(10, 11, 7);
        System.out.println(intersectionOfTwoArrays(listThree, listFour)); // Output: [7]

         List<Integer> listFive = List.of(1,2,3);
        List<Integer> listSix = List.of(4,5,6);
        System.out.println(intersectionOfTwoArrays(listFive, listSix)); // Output: []
    }
}