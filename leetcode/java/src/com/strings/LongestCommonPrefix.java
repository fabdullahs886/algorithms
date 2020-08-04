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
//TODO: check other solution
//https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1162/

package com.strings;

public class LongestCommonPrefix {

    private String longestCommonPrefix(String[] strs) {
        if( strs.length <= 0) return "";
        System.out.println("flower".indexOf("flower"));
        System.out.println("flow".indexOf("flower"));

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
        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // ans: fl
        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"})); // ans: ""

    }
}
