package com.problems.easy;

public class IsSubsequence {
    private boolean isSubsequence(String s, String t) {
        return solution2(s,t);
    }

    private boolean solution2(String s, String t){
        int pointer1 = 0, pointer2 = 0;

        while(pointer1 < s.length() && pointer2 < t.length()){
            if(s.charAt(pointer1) == t.charAt(pointer2)){
                pointer1++;
            }
            pointer2++;
        }
        return pointer1 == s.length();
    }

    private boolean solution1(String s, String t){
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();

        int j = 0;
        for(int i = 0; i < sc.length;i++){
            char c = sc[i];
            boolean flag = false;
            for(; j < st.length;j++){
                if(c == st[j]) {
                    flag = true;
                    j++;
                    break;
                }
            }
            if(!flag)
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        IsSubsequence obj = new IsSubsequence();
        System.out.println(obj.isSubsequence("aaaaaa", "bbaaaa")); // false
        System.out.println(obj.isSubsequence("acb", "ahbgdc")); // false
        System.out.println(obj.isSubsequence("abc", "ahbgdc")); // true
        System.out.println(obj.isSubsequence("axc", "ahbgdc")); // false
        System.out.println(obj.isSubsequence("a", "a")); // true
        System.out.println(obj.isSubsequence("a", "b")); // false
    }
}