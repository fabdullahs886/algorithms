package com.problems.easy;

import java.util.Stack;

public class MakeTheStringGreat {
    private String makeGood(String s) {

        if(s.trim().length() == 0 || s.trim().length() == 1)
            return s;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (stack.size() == 0) {
                stack.push(c);
                continue;
            }
            char cl = stack.pop();
            if(cl + 32 == c || cl - 32 == c){
                continue;
            }else{
                stack.push(cl);
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        for(int i = 0; i < size;i++){
            sb.insert(0,stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args){
        MakeTheStringGreat obj = new MakeTheStringGreat();
        System.out.println(obj.makeGood("leEeetcode")); // "leetcode"
        System.out.println(obj.makeGood("abBAcC")); // ""
    }
}
