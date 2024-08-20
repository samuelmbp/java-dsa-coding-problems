package org.samuelraducan.arrays;

import java.util.List;
import java.util.stream.Collectors;

/**
 Objective:
 Given an ArrayList of integers, modify the list by removing all even numbers
 leaving only the odd numbers in the list.

 Input:
 An ArrayList<Integer> containing a sequence of integers.

 Output:
 The modified ArrayList<Integer> with all even numbers removed, only containing odd numbers.

 Examples:
 Input: [1, 2, 3, 4, 5, 6]
 Output: [1, 3, 5]

 Input: [10, 13, 16, 19, 20]
 Output: [13, 19]

 Input: [2, 4, 6, 8]
 Output: [] (an empty list, since all numbers were even)

 Constraints:
 The input list can contain both positive and negative integers.
 The list may be empty, in which case no changes are needed and the list remains empty.
 */

public class RemoveEvenNumbers {

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Numbers list cannot be null.");
        }

        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(removeEvenNumbers(numbers));
    }
}
