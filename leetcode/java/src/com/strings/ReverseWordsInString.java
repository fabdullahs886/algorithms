package com.strings;

//Given an input string, reverse the string word by word.
//
//
//
//        Example 1:
//
//        Input: "the sky is blue"
//        Output: "blue is sky the"
//        Example 2:
//
//        Input: "  hello world!  "
//        Output: "world! hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
//        Example 3:
//
//        Input: "a good   example"
//        Output: "example good a"
//        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//
//
//        Note:
//
//        A word is defined as a sequence of non-space characters.
//        Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
//        You need to reduce multiple spaces between two words to a single space in the reversed string.
//
//
//        Follow up:
//
//        For C programmers, try to solve it in-place in O(1) extra space.

public class ReverseWordsInString {
    private String reverseWords(String s) {
        if ( s.trim().length() == 0) return "";
        String[] str = s.split(" ");
        StringBuilder bld = new StringBuilder();

        for(int i = str.length -1; i >= 0;i--){
            if (str[i].trim().length() == 0) continue;
            bld.append(str[i].trim()).append(" ");
        }
        String st = bld.substring(0,bld.length() - 1);
        return st;
    }

    public static void main(String[] args) {
        ReverseWordsInString sol = new ReverseWordsInString();
        System.out.println(sol.reverseWords("the sky is blue")); // ans: "blue is sky the"
        System.out.println(sol.reverseWords("  hello world!  ")); // ans: "world! hello"
        System.out.println(sol.reverseWords("a good   example")); // ans: "example good a"
    }
}
