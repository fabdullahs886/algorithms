package com.problems.easy;

public class MergeStringsAlternately {
    private String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(i < word1.length())
                sb.append(word1.charAt(i));
            if(i < word2.length())
                sb.append(word2.charAt(i));
        }

        if(word1.length() > len)
            sb.append(word1.substring(len, word1.length()));

        if(word2.length() > len)
            sb.append(word2.substring(len, word2.length()));

        return sb.toString();
    }

    public static void main(String[] args){
        MergeStringsAlternately obj = new MergeStringsAlternately();
        System.out.println(obj.mergeAlternately("abc", "pqr")); // "apbqcr
        System.out.println(obj.mergeAlternately("ab", "pqrs")); // "apbqrs
        System.out.println(obj.mergeAlternately("abcd", "pq")); // "apbqcd
    }
}
