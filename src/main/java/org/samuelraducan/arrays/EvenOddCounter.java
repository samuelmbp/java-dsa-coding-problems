package org.samuelraducan.arrays;


/**
Given an array of integers, you need to count how many of the elements are even and how many are odd. An even number is any integer that is divisible by 2, while an odd number is not.

Input
An array of integers, e.g., [1, 2, 3, 4, 5, 6].

Output
Two integers: the count of even numbers and the count of odd numbers.

Example
For the input array [1, 2, 3, 4, 5, 6]:
Even count: 3 (the even numbers are 2, 4, and 6)
Odd count: 3 (the odd numbers are 1, 3, and 5) 
 */

public class EvenOddCounter {
    
    public static void countEvenOdd(int[] numbers) {
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int number : numbers) {
            if (number % 2 == 0) evenNumbers++;
            else if (number % 2 != 0) oddNumbers++;
        }

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        countEvenOdd(numbers);
    }
}
