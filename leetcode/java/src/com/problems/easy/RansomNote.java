package com.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    private boolean canConstruct(String ransomNote, String magazine) {
        return solution2(ransomNote,magazine);
    }

    private boolean solution2(String ransomNote, String magazine){
        int[] ch = new int[26];
        for(char c: magazine.toCharArray()){
            ch[c - 'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            int index = c - 'a';
            if(ch[index] == 0) return false;
            ch[index]--;
        }
        return true;
    }

    private boolean solution1(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < magazine.length();i++){
            char c  = magazine.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i < ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map.get(c) == null || map.get(c) == 0)
                return false;

            int count = map.get(c);
            map.put(c,--count);
        }

        return true;
    }

    public static  void main(String[] args){
        RansomNote obj = new RansomNote();
        System.out.println(obj.canConstruct("a", "b")); // false
        System.out.println(obj.canConstruct("aa", "ab")); // false
        System.out.println(obj.canConstruct("aa", "aab")); // true
    }
}
