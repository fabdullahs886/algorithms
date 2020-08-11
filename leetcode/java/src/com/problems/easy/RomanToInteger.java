package com.problems.easy;

// Category : Easy
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
//
//        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
//
//        Example 1:
//
//        Input: "III"
//        Output: 3
//        Example 2:
//
//        Input: "IV"
//        Output: 4
//        Example 3:
//
//        Input: "IX"
//        Output: 9
//        Example 4:
//
//        Input: "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//        Example 5:
//
//        Input: "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private int romanToInt(String s) {
        int result = solution1(s);
        result = solution2(s);
        return  result;
    }

    private int solution2(String s){
        if(s == null) return 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int num = 0;
        for(int i = 0; i < s.length(); i++){
            int next = 0;
            int cur = map.get(String.valueOf(s.charAt(i)));
            if(i + 1 < s.length())
                next = map.get(String.valueOf(s.charAt(i + 1)));
            else next = 0;
            if(cur >= next){
                num += cur;
            }else {
                num += (next - cur);
                i++;
            }
        }
        return num;
    }

    private int solution1(String s){
        if( s == null) return 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        char[] c = s.toCharArray();

        int num = 0;
        for(int i = c.length - 1; i >= 0; i--){
            num += map.get(String.valueOf(c[i]));
            if(i - 1 >= 0 ) {
                if ((c[i] == 'V' || c[i] == 'X') && c[i-1] == 'I') {
                    num -= 1;
                    i--;
                }
                if ((c[i] == 'L' || c[i] == 'C') && c[i-1] == 'X') {
                    num -= 10;
                    i--;
                }
                if ((c[i] == 'D' || c[i] == 'M') && c[i-1] == 'C') {
                    num -= 100;
                    i--;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("III")); //ans: 3
        System.out.println(obj.romanToInt("IV")); //ans: 4
        System.out.println(obj.romanToInt("IX")); //ans: 9
        System.out.println(obj.romanToInt("LVIII")); //ans: 58
        System.out.println(obj.romanToInt("MCMXCIV")); //ans: 1994
    }
}
