package com.problems.easy;

public class CountTheNumberOfConsistentStrings {

    private int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean flag = true;
        for(String word: words){
            flag = true;
            for(char c: word.toCharArray()){
                if(allowed.indexOf(c) == -1) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        CountTheNumberOfConsistentStrings obj = new CountTheNumberOfConsistentStrings();
        System.out.println(obj.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"})); // 2
        System.out.println(obj.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"})); // 7
        System.out.println(obj.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"})); // 4
    }
}
