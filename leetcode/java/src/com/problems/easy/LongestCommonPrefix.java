package com.problems.easy;

// Category : Easy
//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//        All given inputs are in lowercase letters a-z.
//
//        Example 1:
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//
//        Example 2:
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

public class LongestCommonPrefix {

    private String longestCommonPrefix(String[] strs) {
        if( strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String result = solution1(strs);
        result = solution2(strs);
        return result;
    }

    private String solution2(String[] strs){
        if( strs.length <= 0) return "";

        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++ ){
                if( i == strs[j].length() || strs[j].charAt(i) != c ){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    private String solution1(String[] strs){
        if( strs.length <= 0) return "";

        String prefix = strs[0];
        for(int i = 0; i < strs.length; i ++){
            while( strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }

        }
        return prefix;

    }

    public static void main(String[] args){
        LongestCommonPrefix sol = new LongestCommonPrefix();
        System.out.println(sol.longestCommonPrefix(new String[]{"aa","a"})); // ans: a
        System.out.println(sol.longestCommonPrefix(new String[]{"c","c"})); // ans: c
        System.out.println(sol.longestCommonPrefix(new String[]{})); // ans: ""
        System.out.println(sol.longestCommonPrefix(new String[]{"a"})); // ans: fl
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // ans: fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"})); // ans: ""

    }
}
