package com.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    private boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, int[]> map = new HashMap<>();
        for(int[] piece : pieces) {
            map.put(piece[0], piece);
        }
        System.out.println("mm "+ map);
        List<Integer> list = new ArrayList<>();
        for(int n: arr)
            list.add(n);

        for(int[] nums: pieces){
            int index = 0;
            for(int num: nums){
                if(!list.contains(num)) {
                    return false;
                }else{
                    if(nums.length == 1) continue;
                    int cur = list.indexOf(num);
                    if(index == 0) {
                        index = cur;
                    }else{
                        if(index != cur) return false;
                    }
                    index++;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        CheckArrayFormationThroughConcatenation obj = new CheckArrayFormationThroughConcatenation();
        System.out.println(obj.canFormArray(new int[]{37,69,3,74,46},new int[][]{{37,69,3,74,46}})); // true
        System.out.println(obj.canFormArray(new int[]{1,2,3},new int[][]{{2},{1,3}})); // false
        System.out.println(obj.canFormArray(new int[]{85},new int[][]{{85}}));  // true
        System.out.println(obj.canFormArray(new int[]{15,88},new int[][]{{88},{15}})); // true
        System.out.println(obj.canFormArray(new int[]{49,18,16},new int[][]{{16,18,49}})); // false
        System.out.println(obj.canFormArray(new int[]{91,4,64,78},new int[][]{{78},{4,64},{91}})); // true
        System.out.println(obj.canFormArray(new int[]{1,3,5,7},new int[][]{{2,4,6,8}})); // false
    }
}
