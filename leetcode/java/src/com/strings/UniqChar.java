package com.strings;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

import java.util.*;

class UniqChar {
    public int firstUniqChar(String s) {
        if( s.length() == 0)
            return -1;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++){
            String key = Character.toString(s.charAt(i));
            if ( map.containsKey(key)){
                Integer val = map.get(key);
                val++;
                map.put(key,val);
            }else{
                map.put(key,1);
            }
            list.add(key);
        }

        for( int i =0; i < list.size(); i++){
            String str = list.get(i);
            if ( map.get(str) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        UniqChar sol  = new UniqChar();
        int ret = sol.firstUniqChar("cc");
        System.out.println(ret);
        ret = sol.firstUniqChar("leetcode");
        System.out.println(ret);
        ret = sol.firstUniqChar("leetcodel");
        System.out.println(ret);
        ret = sol.firstUniqChar("");
        System.out.println(ret);

    }
}