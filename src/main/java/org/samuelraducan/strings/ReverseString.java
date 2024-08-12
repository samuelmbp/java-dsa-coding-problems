package org.samuelraducan.strings;

/**
Objective:
 * Given a string, reverse the characters in the string and return the reversed string.

 Input:
 A single string s containing only alphanumeric characters, spaces, and punctuation.
 The string can include any printable characters.

 Output:
 A single string that is the reverse of the input string.

 Examples:
 Input: "Java is fun!"
 Output: "nuf si avaJ"

 Input: "12345"
 Output: "54321"
 */

public class ReverseString {

    public static String reverseString(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence must not be null or empty.");
        }

        return new StringBuilder(sentence).reverse().toString();
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println(reverseString(sentence)); // nuf si avaJ

        String anotherSentence = "12345";
        System.out.println(reverseString(anotherSentence)); //54321

    }
}
