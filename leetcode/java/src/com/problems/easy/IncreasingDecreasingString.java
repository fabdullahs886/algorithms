package com.problems.easy;

public class IncreasingDecreasingString {
    private String sortString(String s) {
        StringBuilder result = new StringBuilder();
        char[] freq = new char[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        int count = s.length();

        while(count != 0){
            for(int i = 0; i < freq.length;i++){
                if(freq[i] != 0){
                    result.append((char) ('a' + i));
                    freq[i]--;
                    count--;
                }
            }
            for(int i = freq.length-1;i >= 0;i--){
                if(freq[i] != 0){
                    result.append((char) ('a' + i));
                    count--;
                    freq[i]--;
                }
            }
        }
        return result.toString();
    }

    public static void main(String [] args){
        IncreasingDecreasingString obj = new IncreasingDecreasingString();
        System.out.println(obj.sortString("aaaabbbbcccc")); // "abccbaabccba
        System.out.println(obj.sortString("rat")); // "art
        System.out.println(obj.sortString("leetcode")); // "cdelotee
        System.out.println(obj.sortString("ggggggg")); // "ggggggg
        System.out.println(obj.sortString("spo")); // "ops
    }
}
