package org.samuelraducan.hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
Description:
 * Given an array of strings, group the anagrams together.

Example:
 *     Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 *     Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

Tips:
 *     Use a HashMap to map a sorted version of each string to a list of its anagrams.
 *     Iterate through the array, sort each string, and add it to the corresponding list in the HashMap.

 Steps:
 * Initialize a HashMap where keys are sorted strings and values are lists of anagrams.
 * Iterate through the array of strings.
 * For each string, sort it and use the sorted string as a key.
 * Add the original string to the list of anagrams for that key.
 * Return the values of the HashMap as a list of lists.
 */

public class GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> wordsToAnagrams = new HashMap<>();
        
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            char[] sortedChars = lowerCaseWord.toCharArray();
            Arrays.sort(sortedChars);
            String sortedWord = new String(sortedChars);
        
            wordsToAnagrams.putIfAbsent(sortedWord, new ArrayList<>());
            wordsToAnagrams.get(sortedWord).add(lowerCaseWord);
        }

        return new ArrayList<>(wordsToAnagrams.values());
    }

    public static void main(String[] args) {
        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> anagrams = groupAnagrams(words);
        System.out.println(anagrams); // Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    }
}
