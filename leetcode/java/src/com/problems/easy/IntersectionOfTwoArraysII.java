package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {
    private int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for(int num: nums2){
            if(list1.contains(num)) {
                result.add(num);
                list1.remove(new Integer(num));
            }
        }
        System.out.println(result);
        return result.stream().mapToInt(k -> k).toArray();
    }



    public static void main(String[] args){
        IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();
        System.out.println(obj.intersect(new int[]{-2147483648,1,2,3}, new int[]{1,-2147483648,-2147483648})); // [1,-2147483648]
        System.out.println(obj.intersect(new int[]{1,2,2,1}, new int[]{2,2})); // [2,2]
        System.out.println(obj.intersect(new int[]{4,9,5,9}, new int[]{9,4,9,8,4})); // [4,9]
    }
}
