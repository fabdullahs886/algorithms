package com.problems.easy;

// Category : Easy
//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
//
//        If the last word does not exist, return 0.
//
//        Note: A word is defined as a maximal substring consisting of non-space characters only.
//
//        Example:
//
//        Input: "Hello World"
//        Output: 5

public class LengthOfLastWord {

    private int lengthOfLastWord(String s) {
        if(s == null || s.trim().length() == 0) return 0;

        s = s.trim();
        int len = 0;
        for(int i  = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ')
                break;
            len += 1;
        }
        return len;

    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord(null)); // ans: 0
        System.out.println(obj.lengthOfLastWord("")); // ans: 0
        System.out.println(obj.lengthOfLastWord("a")); // ans: 1
        System.out.println(obj.lengthOfLastWord("Hello World")); // ans: 5
        System.out.println(obj.lengthOfLastWord("Hello Worlds")); // ans: 6
        System.out.println(obj.lengthOfLastWord("Hello Worlds asd")); // ans: 3
    }
}
