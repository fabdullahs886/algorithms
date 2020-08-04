package com.strings;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Note: For the purpose of this problem, we define empty string as valid palindrome.

public class ValidPalindrome {

    private boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]+", "");

        if ( s.trim().length() <= 0)
            return  true;


        char[] c = s.toCharArray();
        int len = c.length / 2;
        int rp = c.length - 1;


        for(int i = 0; i < len; i++){
            if ( c[i] != c[rp])
                return  false;
            rp--;
        }
        return true;
    }

    public static void main(String[] args){
        ValidPalindrome sol = new ValidPalindrome();
        System.out.println(sol.isPalindrome("as"));
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(sol.isPalindrome("0p"));
        System.out.println(sol.isPalindrome("a"));
    }
}
