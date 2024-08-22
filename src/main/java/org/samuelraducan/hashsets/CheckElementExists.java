package org.samuelraducan.hashsets;

import java.util.Arrays;
import java.util.List;

public class CheckElementExists {

    public static boolean containsElement(List<String> list, String element) {
        return list.contains(element);
    }
    
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "blueberries", "banana");
        boolean exists = containsElement(words, "blueberries"); // true
        System.out.println(exists);
    }
}
