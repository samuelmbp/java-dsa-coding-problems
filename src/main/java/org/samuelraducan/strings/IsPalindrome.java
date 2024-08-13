package org.samuelraducan.strings;

/**
 Objective:
 Determine whether a given string is a palindrome.
 A palindrome is a string that reads the same forward and backward, ignoring spaces, punctuation, and case differences.

 Input:
 A single string s containing alphanumeric characters, spaces, and punctuation.

 Output:
 A boolean value (true or false):
 true if the string is a palindrome.
 false if the string is not a palindrome.

 Examples:
 Input: "A man, a plan, a canal, Panama"
 Output: true

 Input: "racecar"
 Output: true

 Input: "hello"
 Output: false
 */

public class IsPalindrome {

    public static boolean isPalindrome(String sentence) {
        if (sentence == null) return false;

        String cleanedSentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversedSentence = new StringBuilder(cleanedSentence);
        reversedSentence.reverse();

        return cleanedSentence.equals(reversedSentence.toString());
    }

    public static void main(String[] args) {

        String sentence = "racecar";
        System.out.println(isPalindrome(sentence)); // true

        String anotherSentence = "A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(anotherSentence)); // true

        String hello = "hello";
        System.out.println(isPalindrome(hello)); // false
    }
}
