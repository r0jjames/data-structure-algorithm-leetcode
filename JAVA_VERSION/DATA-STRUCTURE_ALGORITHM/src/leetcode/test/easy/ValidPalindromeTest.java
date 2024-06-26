package leetcode.test.easy;

import leetcode.easy.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
https://leetcode.com/problems/valid-palindrome/description/
125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 */
class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome;

    ValidPalindromeTest() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void testValidPalindrome1() {
        String s =  "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome2(s));
    }

    @Test
    void testValidPalindrome2() {
        String s = "race a car";
        assertFalse(validPalindrome.isPalindrome2(s));
    }
}