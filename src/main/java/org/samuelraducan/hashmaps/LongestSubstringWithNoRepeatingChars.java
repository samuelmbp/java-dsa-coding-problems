package org.samuelraducan.hashmaps;

import java.util.HashSet;
import java.util.Set;

/**
 Description: Given a string s, find the length of the longest substring without repeating characters.   

Input: A string s.

Output: An integer representing the length of the longest substring without repeating characters.

Examples:

Input	    Output	    Explanation
"abcabcbb"	3	        The answer is "abc" with length 3.
"bbbbb"	    1	        The answer is "b" with length 1.
"pwwkew"	3	        The answer is "wke" with length 3. Note that the 
                        answer must be a substring, "pwke" is a subsequence and not a substring. 
 */

public class LongestSubstringWithNoRepeatingChars {

    public static int longestSubstringWithNoRepeatingChars(String word) {
        Set<Character> uniqueCharacters = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < word.length(); right++) {
            while(uniqueCharacters.contains(word.charAt(right))) {
                uniqueCharacters.remove(word.charAt(left));
                left++;
            }

            uniqueCharacters.add(word.charAt(right));
            maxLength = Math.max(maxLength, right - left  + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String word = "pwwkew";
        System.out.println(longestSubstringWithNoRepeatingChars(word));
    }
    
}
