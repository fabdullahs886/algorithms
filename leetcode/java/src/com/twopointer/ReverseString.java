package com.twopointer;

//Write a function that reverses a string. The input string is given as an array of characters char[].
//
//        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//        You may assume all the characters consist of printable ascii characters.
//
//        Example 1:
//
//        Input: ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//        Example 2:
//
//        Input: ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]

public class ReverseString {
    private void reverseString(char[] s) {
        int mid = s.length/2;
        int i = 0, j = s.length - 1;
        while(i < j){
            char tmp = s[j];
            s[j] = s[i];
            s[i] = tmp;
            i++;
            j--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();

        sol.reverseString(new char[]{'h','e','l','l','o'}); // ans : "o","l","l","e","h"
        sol.reverseString(new char[]{'H','a','n','n','a','h'}); // ans : "h","a","n","n","a","H"
    }
}
