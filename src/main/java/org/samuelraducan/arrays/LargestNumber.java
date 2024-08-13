package org.samuelraducan.arrays;

import java.util.Arrays;
import java.util.List;

/**
 Objective:
 Identify and return the largest number in a given array of integers.

 Input:
 An array arr of integers, where arr[i] represents the elements in the array.

 Output:
 A single integer, which is the largest number present in the array.

 Examples:
 Input: [1, 5, 3, 9, 2]
 Output: 9

 Input: [-10, -3, -5, -2]
 Output: -2

 Input: [7]
 Output: 7

 Constraints:

 The array will contain at least one element.
 The array can contain both positive and negative integers.
 */

public class LargestNumber {

    public static int findLargestNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Numbers list cannot be null or empty.");
        }

        int largestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,10,4,13,3,11);
        int largest = findLargestNumber(numbers);
        System.out.println(largest);
    }
}
