package org.samuelraducan.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the First Non-Repeating Element:
	•	Objective: Return the first non-repeating element from an ArrayList of integers.
	•	Example: Input: [9, 4, 9, 6, 7, 4] Output: 6
 */
public class FindFirstNonRepeatingElement {
    
    public static int findFirstNonRepeatingElement(int[] numbers) {
        Map<Integer, Integer> numFrequencies = new HashMap<>();
        int firstNonRepeatingElement = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (!numFrequencies.containsKey(number)) numFrequencies.put(number, 1);
            else numFrequencies.put(number, numFrequencies.get(number) + 1);
        }

        for (int number: numbers) {
            if (numFrequencies.get(number) == 1) {
                firstNonRepeatingElement = number;
                return number;
            } 
        }

        return firstNonRepeatingElement;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 6, 6, 5, 1};        
        int firstNonRepeatingElement = findFirstNonRepeatingElement(numbers);
        System.out.println(firstNonRepeatingElement); // Output: 2
    }
}
