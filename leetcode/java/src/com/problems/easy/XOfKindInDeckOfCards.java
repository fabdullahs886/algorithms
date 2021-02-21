package com.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class XOfKindInDeckOfCards {
    private boolean hasGroupsSizeX(int[] deck) {
        if(deck == null || deck.length <= 1) return false;

        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < deck.length;i++){
            int num = deck[i];
            if(map.get(num) ==  null){
                map.put(num,1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }

        search: for(int X = 2; X <= deck.length; X++){
            if(deck.length%X == 0){
                for(Integer val: map.values()){
                    if(val%X != 0)
                        continue search;
                }
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        XOfKindInDeckOfCards obj = new XOfKindInDeckOfCards();
        System.out.println(obj.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1})); //true
        System.out.println(obj.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3})); //false
        System.out.println(obj.hasGroupsSizeX(new int[]{1})); //false
        System.out.println(obj.hasGroupsSizeX(new int[]{1,1})); //true
        System.out.println(obj.hasGroupsSizeX(new int[]{1,1,2,2,2,2})); //true
        System.out.println(obj.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2})); //true
    }
}
