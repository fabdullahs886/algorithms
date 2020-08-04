package com.strings;

//Given two strings s and t , write a function to determine if t is an anagram of s.

import java.util.Arrays;


public class ValidAnagram {

    private boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        s = new String(c1);
        t = new String(c2);

        if ( s.equals(t))
            return true;

        return false;
    }

    public static void main(String[] args){
        ValidAnagram sol  = new ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
    }

}
