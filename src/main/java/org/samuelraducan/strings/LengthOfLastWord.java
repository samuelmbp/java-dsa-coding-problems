package org.samuelraducan.strings;

public class LengthOfLastWord {

    public static int getLengthOfLastWord(String sentence) {
        if (sentence.isEmpty()) return 0;

        String[] words = sentence.trim().split(" ");
        String lastWord = words[words.length - 1];
        System.out.println(lastWord);

        return lastWord.length();
    }
    
    public static void main(String[] args) {
        String sentence = "Fly me to the moon";
        System.out.println("Length: " + getLengthOfLastWord(sentence)); // 4 (moon)
    }
}
