package com.problems.easy;

//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//        Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//        Example 1:
//
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
//        Example 2:
//
//        Input: jewels = "z", stones = "ZZ"
//        Output: 0
//
//
//        Constraints:
//
//        1 <= jewels.length, stones.length <= 50
//        jewels and stones consist of only English letters.
//        All the characters of jewels are unique.

import java.util.ArrayList;
import java.util.List;

public class JewelsAndStones {
    private int numJewelsInStones(String jewels, String stones) {
        solution1(jewels, stones);
        return solution2(jewels,stones);
    }

    private int solution2(String jewels, String stones){
        int count = 0;
        if (jewels.trim().length() == 0) return count;

        List<Character> list = new ArrayList<Character>();
        for(int i = 0; i < jewels.length(); i++){
            list.add(jewels.charAt(i));
        }
        for(int i =0; i < stones.length();i++){
            if(list.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }

    private int solution1(String jewels, String stones){
        int count = 0;
        if(jewels.trim().length() == 0) return count;

        for(int i = 0; i < jewels.length();i++ ){
            String s = String.valueOf(jewels.charAt(i));
            for(int j = 0; j < stones.length();j++){
                if( String.valueOf(stones.charAt(j)).equals(s))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones obj = new JewelsAndStones();
        System.out.println(obj.numJewelsInStones("aA","aAAbbbb"));  //  3
        System.out.println(obj.numJewelsInStones("z","ZZ"));  //  0
    }
}
