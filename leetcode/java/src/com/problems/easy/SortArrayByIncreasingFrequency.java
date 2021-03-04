package com.problems.easy;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    private int[] frequencySort(int[] nums) {
        return solution1(nums);
    }

    private int[] solution1(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list,(a,b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
//        System.out.println(">>>>" + map);
        int j = 0;
        int[] result = new int[nums.length];
        for(Map.Entry<Integer,Integer> entry: list){
//            System.out.println("-----" + entry);
            for(int i=0; i < entry.getValue();i++){
                result[j++] = entry.getKey();
            }
        }
        return result;
    }

    public static void  main(String[] args){
        SortArrayByIncreasingFrequency obj = new SortArrayByIncreasingFrequency();
        System.out.println(Arrays.toString(obj.frequencySort(new int[]{1,1,2,2,2,3})));// [3,1,1,2,2,2]
        System.out.println(Arrays.toString(obj.frequencySort(new int[]{2,3,1,3,2})));// [1,3,3,2,2]
        System.out.println(Arrays.toString(obj.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));// [5,-1,4,4,-6,-6,1,1,1]
    }
}
