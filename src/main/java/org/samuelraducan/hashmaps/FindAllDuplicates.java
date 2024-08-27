package org.samuelraducan.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
Problem Statement:

Given an integer array numbers of length n, where 1 <= numbers[i] <= n, some elements appear twice and others appear once. Your task is to write a function that returns all the elements that appear twice in this array.

Example 1:
	•	Input: nums = [4,3,2,7,8,2,3,1]
	•	Output: [2, 3]

Example 2:

	•	Input: nums = [1,1,2]
	•	Output: [1]

Example 3:

	•	Input: nums = [1]
	•	Output: []

Edge Cases:
	•	Empty Array: If the input array is empty, the function should return an empty list.
	•	Single Element Array: If the input array has only one element, the function should return an empty list.
	•	All Unique Elements: If all elements in the array are unique, the function should return an empty list.
	•	All Duplicate Elements: If every element in the array appears exactly twice, the function should return a list of all elements. 
 */

public class FindAllDuplicates {

    public static List<Integer> findAllDuplicates(List<Integer> numbers) {
        if (numbers.isEmpty() || numbers.size() == 1) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> countFrequencies = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer number : numbers) {
            if (!countFrequencies.containsKey(number)) countFrequencies.put(number, 1);
            else countFrequencies.put(number, countFrequencies.get(number) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : countFrequencies.entrySet()) {
            if (entry.getValue() > 1) duplicates.add(entry.getKey());
        }

        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,3,2,7,8,2,3,1);
        List<Integer> duplicates = findAllDuplicates(numbers);
        System.out.println(duplicates); // Output: [2, 3]
    }
}
