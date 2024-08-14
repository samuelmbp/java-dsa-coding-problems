package org.samuelraducan.arrays;

import java.util.List;

/**
 Objective
 Given an array of numbers, determine and return the second-largest number present within it.

 Additional Considerations:
 The array can contain duplicate values.
 The array must have at least two elements.
 If the array contains only two elements, return the smaller one as the second largest.

 Example 1:
 Input: [3, 7, 2, 9, 5]
 Output: 7

 Example 2:
 Input: [2, 1]
 Output: 1

 Example 3:
 Input: [9, 9, 8, 7, 6]
 Output: 8

 Example 4:
 Input: [1, 1, 1]
 Output: 1 (Since there are only duplicates, the second largest is the same as the largest)
 */

public class SecondLargestNumber {

    public static int findSecondLargestNumber(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        int largest = numbers.get(0);
        int secondLargest = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number != largest && number > secondLargest) {
                secondLargest = number;
            }
        }

        // Handle cases with no distinct second largest
        return (secondLargest == Integer.MIN_VALUE) ? largest : secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 1);
        int secondLargestNumber = findSecondLargestNumber(numbers);
        System.out.println(secondLargestNumber); // Output: 1

        List<Integer> anotherNumbers = List.of(9, 9, 8, 7, 6);
        System.out.println(findSecondLargestNumber(anotherNumbers)); // Output: 8

        List<Integer> listWithNumbersLessThanTwo = List.of(9);
        // Output: List must contain at least two elements.
        System.out.println(findSecondLargestNumber(listWithNumbersLessThanTwo));

    }
}
