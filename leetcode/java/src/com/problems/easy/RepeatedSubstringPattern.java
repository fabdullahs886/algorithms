package com.problems.easy;

public class RepeatedSubstringPattern {
    private boolean repeatedSubstringPattern(String s) {
        return  solution2(s);
    }

    private boolean solution2(String s){
        int len = s.length();
        for(int i = len/2;i >= 1;i--){
            if(len%i == 0){
                int repeats = len/i;
                StringBuilder sb = new StringBuilder();
                String substring = s.substring(0,i);
                for(int j = 0; j < repeats;j++){
                    sb.append(substring);
                }
                if(s.equals(sb.toString()))
                    return true;
            }
        }
        return false;
    }

    private boolean solution1(String s){
        int n = s.length();
//        if(len == 0 || len == 1) return false;
        for(int l = n/2;l > 0; l--){
            if(n%l == 0) {
                int i = 0;
                while (i + l < n && s.charAt(i) == s.charAt(i + l)) {
                    i++;
                }
                if (i + l == n)
                    return true;
            }

        }

        return false;
    }

    public  static void main(String[] args){
        RepeatedSubstringPattern obj = new RepeatedSubstringPattern();
        System.out.println((obj.repeatedSubstringPattern("ababab"))); //true
        System.out.println((obj.repeatedSubstringPattern("abab"))); //true
        System.out.println((obj.repeatedSubstringPattern("aba"))); //false
        System.out.println((obj.repeatedSubstringPattern("abcabcabcabc"))); //true
    }
}
