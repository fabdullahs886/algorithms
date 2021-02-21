package com.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    private int titleToNumber(String s) {
        Map<String,Integer> map = new HashMap();
        map.put("A",1);map.put("H",8);map.put("O",15);map.put("V",22);
        map.put("B",2);map.put("I",9);map.put("P",16);map.put("W",23);
        map.put("C",3);map.put("J",10);map.put("Q",17);map.put("X",24);
        map.put("D",4);map.put("K",11);map.put("R",18);map.put("Y",25);
        map.put("E",5);map.put("L",12);map.put("S",19);map.put("Z",26);
        map.put("F",6);map.put("M",13);map.put("T",20);
        map.put("G",7);map.put("N",14);map.put("U",21);


        int result = 0;
        int len = s.length();
        int j = 0;
        for(int i = len  - 1; i >= 0; i--){
            String letter = String.valueOf(s.charAt(i));
            result += map.get(letter)*Math.pow(26,j);
            j++;
        }

        return result;
    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();
        System.out.println(obj.titleToNumber("AB")); // 1
    }

    }
