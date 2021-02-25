package com.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    private int majorityElement(int[] nums) {
        return solution2(nums);
    }

    private int solution1(int[] nums){
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
            map.put(nums[i], count + 1);
        }
        System.out.println(map);
        int majority = nums.length/2;
        System.out.println("majority: " + majority);
        for(int key: map.keySet()){
            if ( map.get(key) > majority)
                return key;
        }
        return 0;
    }

    private int solution2(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args){
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(new int[]{3,2,3})); // 3
        System.out.println(obj.majorityElement(new int[]{2,2,1,1,1,2,2})); // 2
    }
}
