package com.problems.easy;

public class BinarySearch {
    private int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid -1 ;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 9)); // 4
        System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 2)); // -1
        System.out.println(obj.search(new int[]{5}, 5)); // 0
        System.out.println(obj.search(new int[]{5}, -5)); // -1
    }
}
