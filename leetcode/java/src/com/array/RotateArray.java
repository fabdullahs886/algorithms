package com.array;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//        Follow up:
//
//        Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
//        Could you do it in-place with O(1) extra space?
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//        Example 2:
//
//        Input: nums = [-1,-100,3,99], k = 2
//        Output: [3,99,-1,-100]
//        Explanation:
//        rotate 1 steps to the right: [99,-1,-100,3]
//        rotate 2 steps to the right: [3,99,-1,-100]

public class RotateArray {

    public int[] rotate(int[] nums, int k) {


        if (k  == 0 )
                return nums;

        if ( nums.length == 0 || nums.length == 1)
            return nums;

        if ( k > nums.length)
            k = k%nums.length;

        System.out.println("K = " + k);

//        // Solution 1
        for ( int j = 0; j < k ; j++) {
            int tmp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                int num2 = nums[i + 1];
                nums[i + 1] = tmp;
                tmp = num2;

            }
            nums[0] = tmp;
        }

        //Solution 2
        int[] tmp = new int[nums.length];
        int index = nums.length - k;
        for (int i = 0; i < nums.length; i++){
            tmp[i] = nums[index];
            if ( index == nums.length - 1) {
                index = 0;
                continue;
            }
            index++;
        }
//        nums = tmp;
        System.arraycopy(tmp, 0, nums, 0, tmp.length);



        for(int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);

        return nums;
    }

    public static void main(String[] args) {
        RotateArray sol = new RotateArray();
        System.out.println(sol.rotate(new int[]{1, 2, 3, 4, 5, 6},11));
        System.out.println(sol.rotate(new int[]{1, 2},3));
        System.out.println(sol.rotate(new int[]{1, 2, 3, 4, 5, 6, 7},3));
        System.out.println(sol.rotate(new int[]{-1, -100, 3, 99},2));
    }
}


