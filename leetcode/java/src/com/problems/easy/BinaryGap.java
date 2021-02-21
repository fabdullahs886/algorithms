package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    private int binaryGap(int n) {
        // Solution 1
//        int result = 0;
//        List<Integer> list  = new ArrayList<>();
//        String str = Integer.toBinaryString(n);
//        for(int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if(c == '1')
//                list.add(i);
//        }
//        for(int i = 0; i < list.size() - 1; i++){
//            if(list.get(i + 1) - list.get(i) > result){
//                result = list.get(i + 1) - list.get(i);
//            }
//        }

        //  Solution2
        int last = 0;
        int result = 0;
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '1'){
                if(i - last > result)
                    result = i - last;
                last = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryGap obj = new BinaryGap();

        System.out.println(obj.binaryGap(2897)); //  4
        System.out.println(obj.binaryGap(15)); //  1
        System.out.println(obj.binaryGap(13)); //  2
        System.out.println(obj.binaryGap(22)); //  2
        System.out.println(obj.binaryGap(5)); //  2
        System.out.println(obj.binaryGap(6)); //  1
        String s = "AB";
        System.out.println(s.indexOf("A"));

    }

}
