package com.problems.easy;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    private int[] sortByBits(int[] arr) {
       int[] result = new int[arr.length];
       Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
       List<Integer> ll = new ArrayList<Integer>();
       for(int num: arr){
           int bitCount = Integer.bitCount(num);
           ll.add(bitCount);
           if(map.get(bitCount) == null){
               List<Integer> list = new ArrayList<Integer>();
               list.add(num);
               map.put(bitCount,list );
           }else{
               List<Integer> list = map.get(bitCount);
               list.add(num);
               map.put(bitCount,list);
           }
       }
       Collections.sort(ll);
       int k = 0;
       for(int bitCount: ll){
           List<Integer> list = map.get(bitCount);
           if(list == null) continue;
           Collections.sort(list);
           for(int n : list) {
               result[k++] = n;

           }
           map.remove(bitCount);
       }

        return result;


    }

    public static void main(String[] args){
        SortIntegersByTheNumberOf1Bits obj = new SortIntegersByTheNumberOf1Bits();
        System.out.println(Arrays.toString(obj.sortByBits(new int[]{0,1,2,3,4,5,6,7,8}))); // [0,1,2,4,8,3,5,6,7]
        System.out.println(Arrays.toString(obj.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1}))); // [1,2,4,8,16,32,64,128,256,512,1024]
        System.out.println(Arrays.toString(obj.sortByBits(new int[]{10000,10000}))); // [10000,10000]
        System.out.println(Arrays.toString(obj.sortByBits(new int[]{2,3,5,7,11,13,17,19}))); // [2,3,5,17,7,11,13,19]
        System.out.println(Arrays.toString(obj.sortByBits(new int[]{10,100,1000,10000}))); // [10,100,10000,1000]
    }
}
