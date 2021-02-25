package com.problems.easy;

//https://leetcode.com/problems/backspace-string-compare/

public class BackspaceStringCompare {
    private boolean backspaceCompare(String S, String T) {
        if(makeString(S).equals(makeString(T)))
            return true;
        else
            return false;
    }

    private String makeString(String S){
        int count = 0;
        String s = "";
        search: for(int i = S.length() - 1; i >= 0;i--){
            char c = S.charAt(i);
            if(c == '#'){
                count ++;
            }else{
                while(count > 0) {
                    count--;
                    continue search;
                }
                s = String.valueOf(c) + s;
            }
        }
        return s;
    }

    public static void main(String[] args){
        BackspaceStringCompare obj = new BackspaceStringCompare();
        System.out.println(obj.backspaceCompare("ab#c", "ad#c")); // true (ac)
        System.out.println(obj.backspaceCompare("ab##", "c#d#")); // true ()
        System.out.println(obj.backspaceCompare("a##c", "#a#c")); // true (c)
        System.out.println(obj.backspaceCompare("a#c", "b")); // false
    }
}
