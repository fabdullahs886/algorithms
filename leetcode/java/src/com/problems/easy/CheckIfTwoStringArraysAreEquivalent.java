package com.problems.easy;

public class CheckIfTwoStringArraysAreEquivalent {
    private boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for(String s: word1){
            sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for(String s: word2){
            sb2.append(s);
        }
        if(sb1.toString().equals(sb2.toString()))
            return true;

        return false;
    }

    public static void main(String[] args){
        CheckIfTwoStringArraysAreEquivalent obj = new CheckIfTwoStringArraysAreEquivalent();
        System.out.println(obj.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})); //true
        System.out.println(obj.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})); // false
        System.out.println(obj.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"})); //true
    }
}
