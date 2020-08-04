package com.array;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//        Note:
//
//        The number of elements initialized in nums1 and nums2 are m and n respectively.
//        You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
//        Example:
//
//        Input:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        Output: [1,2,2,3,5,6]
//
//
//        Constraints:
//
//        -10^9 <= nums1[i], nums2[i] <= 10^9
//        nums1.length == m + n
//        nums2.length == n

import java.util.Arrays;

public class MergeSortedArray {
    private void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for(int i = 0; i < nums1.length; i++){
            if( n == 0)
                break;
            if(nums1[i] == 0){
                nums1[i] = nums2[j];
                j++;
                if(j >= n)
                    break;
            }
        }
        Arrays.sort(nums1);
        for(int num:nums1)
            System.out.println(num);
    }

    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();
        sol.merge(new int[]{-50,-48,-47,-47,-46,-44,-43,-43,-41,-39,-38,-37,-37,-37,-33,-33,-32,-31,-29,-29,-27,-26,-26,-26,-25,-25,-24,-24,-23,-22,-22,-22,-18,-17,-17,-14,-14,-11,-11,-11,-6,-5,-5,-5,-5,-4,-1,0,2,2,2,2,5,6,7,7,9,10,13,13,14,14,18,21,21,21,22,24,24,24,25,26,26,29,29,29,30,30,31,31,32,33,34,34,34,35,38,40,41,42,43,44,44,46,46,47,47,48,49,49},100,new int[]{},0); // ans: [1,2,2,3,5,6]
        sol.merge(new int[]{-1,0,0,3,3,3,0,0,0},6,new int[]{1,2,2},3); // ans: [1,2,2,3,5,6]
        sol.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3); // ans: [1,2,2,3,5,6]

    }

}

