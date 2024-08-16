package org.samuelraducan.hashmaps;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem 1: Count Character Frequencies
 * Write a function that counts the frequency of each character in a string
 * and returns a HashMap with characters as keys and their frequencies as values.
 * Input: "hello"
 * Output: {'h': 1, 'e': 1, 'l': 2, 'o': 1}
 */

public class CountCharacterFrequencies {
    
    public static Map<Character, Integer> countCharacterFrequencies(String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be empty.");
        }

        Map<Character, Integer> characterFrequencies = new HashMap<>();

        // ===================
        /* SOLUTION ONE */
        // ===================

        // for (char character : word.toCharArray()) {
        //     if (!characterFrequencies.containsKey(character)) {
        //         characterFrequencies.put(character, 1);
        //     } else {
        //         characterFrequencies.put(character, characterFrequencies.get(character) + 1);
        //     }
        // }

        // ===================
        /* SOLUTION TWO */
        // ===================
        for (char character : word.toCharArray()) {
            characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
        }

        return characterFrequencies;
    }

    public static void main(String[] args) {
        try {
            String word = "hello";
            Map<Character, Integer> charFrequencies = countCharacterFrequencies(word);
            System.out.println("Output: " + charFrequencies);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
