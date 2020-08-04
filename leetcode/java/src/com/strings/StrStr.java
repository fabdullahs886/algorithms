package com.strings;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class StrStr {
    private int strStr(String haystack, String needle){
        if ( haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }

    public static void main(String[] args){
        StrStr st  =new StrStr();
        System.out.println(st.strStr("hello","ll"));
        System.out.println(st.strStr("aaaaa","bba"));
    }
}
