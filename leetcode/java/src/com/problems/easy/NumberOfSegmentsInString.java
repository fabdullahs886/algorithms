package com.problems.easy;

public class NumberOfSegmentsInString {
    private int countSegments(String s) {
        int res = 0;
        if(s.trim().length() == 0) return res;
        String[] str = s.split(" ");
        for(int i = 0; i < str.length;i++){
            if(str[i].trim().length() == 0)
                continue;
            res++;
        }

        return res;
    }

    public static void main(String[] args){
        NumberOfSegmentsInString obj = new NumberOfSegmentsInString();
        System.out.println(obj.countSegments("Hello, my name is Joh")); // 5
        System.out.println(obj.countSegments("Hello")); // 1
        System.out.println(obj.countSegments("love live! mu'sic forever")); // 4
        System.out.println(obj.countSegments("")); // 0
        System.out.println(obj.countSegments(", , , ,        a, eaefa")); // 6
    }
}
