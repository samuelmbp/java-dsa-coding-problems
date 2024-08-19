package org.samuelraducan.hashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Objective:
The goal is to identify and return the number that appears most frequently in a given list of integers. If there are multiple numbers with the same highest frequency, any of them can be returned.

Inputs:
A list of integers, which may include both positive and negative numbers, as well as zero.
The list can contain duplicates and can be of any size, including empty or null.

Outputs:
The integer that appears most frequently in the list.
If the list is empty or null, an appropriate exception or error message should be returned.
If there are multiple integers with the same highest frequency, the solution can return any one of them.

Example 1:
Input: [3, 1, 3, 2, 2, 3]
Output: 3

Example 2:
Input: [5, 5, -1, -1, 2]
Output: 5 or -1

Example 3:
Input: [0, -1, 0, 0, -1, -1, 2, 2]
Output: 0 or -1

Example 4:
Input: []
Output: Exception or error message.
Explanation: The list is empty, so there is no most frequent number to return.
 */

public class MostFrequentNumber {

    public static int findMostFrequentNumber(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers cannot be null or empty.");
        }

        Map<Integer, Integer> keyValuePairs  = new HashMap<>();
        for (int number : numbers) {
            keyValuePairs.put(number, keyValuePairs.getOrDefault(number, 0) + 1);
        }

        Integer mostFrequentKey = null;
        int highestValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : keyValuePairs.entrySet()) {
            if (entry.getValue() > highestValue) {
                highestValue = entry.getValue();
                mostFrequentKey = entry.getKey();
            }
        }

        return mostFrequentKey;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,1,3,1,1,1);
        System.out.println(findMostFrequentNumber(numbers)); // Output: 1
    }
}

