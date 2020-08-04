package com.strings;

//Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//        Note: In the string, each word is separated by single space and there will not be any extra space in the string.

public class ReverseWordsInString3 {
    private String reverseWords(String s) {
        if ( s.trim().length() == 0) return "";

        String[] str = s.split(" ");
        StringBuilder bld = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            char[] ch = str[i].toCharArray();
            for(int j = ch.length -1 ; j >= 0; j--){
                bld.append(ch[j]);
            }
            bld.append(" ");
        }
        String st = bld.substring(0,bld.length() - 1);
        return st;
    }

    public static void main(String[] args) {
        ReverseWordsInString3 sol = new ReverseWordsInString3();
        System.out.println(sol.reverseWords("Let's take LeetCode contest")); // ans: "s'teL ekat edoCteeL tsetnoc"
    }
}
