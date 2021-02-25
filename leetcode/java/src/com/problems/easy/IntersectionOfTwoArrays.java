package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
    private int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int[] nums = null;
        int[] sec = null;
        if(nums1.length > nums2.length) {
            nums = nums2;
            sec = nums1;
        }else {
            nums = nums1;
            sec = nums2;
        }
        for(Integer num: nums){
            for(int i = 0; i < sec.length; i++){
                if(sec[i] == num && !list.contains(num))
                    list.add(num);
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        System.out.println(list);

        return result;
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        System.out.println(obj.intersection(new int[]{1,2,2,1}, new int[]{2,2}));// [2]
        System.out.println(obj.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})); // [9,4]
    }
}
