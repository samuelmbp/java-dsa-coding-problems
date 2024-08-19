package org.samuelraducan.hashsets;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 The objective of this coding problem is to find and return the distinct words from a list of strings. The solution should identify words that appear only once in the list, ignoring case and excluding duplicates.

 Input: ["apple", "banana", "apple", "orange", "banana"]
 Output: ["apple", "banana", "orange"]
 */

public class DistinctWords {
    
    public static Set<String> findDistinctWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("The list of words cannot be null or empty.");
        }

        // ===================
        /* SOLUTION ONE */
        // ===================
        // Set<String> uniqueWords = new HashSet<>();

        // for (String word : words) {
        //     uniqueWords.add(word.toLowerCase());
        // }

        // return uniqueWords;

        // ===================
        /* SOLUTION TWO */
        // ===================

        return words.stream()
            .map(word -> word.toLowerCase())
            .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana");
        System.out.println(findDistinctWords(words));
    }
}
