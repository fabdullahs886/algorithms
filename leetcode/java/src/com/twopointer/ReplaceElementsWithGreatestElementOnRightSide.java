package com.twopointer;

//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//
//        After doing so, return the array.
//
//
//
//        Example 1:
//
//        Input: arr = [17,18,5,4,6,1]
//        Output: [18,6,6,6,1,-1]
//
//
//        Constraints:
//
//        1 <= arr.length <= 10^4
//        1 <= arr[i] <= 10^5

public class ReplaceElementsWithGreatestElementOnRightSide {

    private int[] replaceElements(int[] arr) {
//    Solution 1
//        for(int i = 0; i < arr.length - 1;i++){
//            int greatest = arr[i + 1];
//            for(int j = i + 1;j < arr.length;j++ ){
//                if(arr[j] > greatest)
//                    greatest = arr[j];
//            }
//            arr[i] = greatest;
//
//        }
//        arr[arr.length - 1] = -1;

//        Solution 2
        int max = -1;
        int i = arr.length-1;
        while(i>=0){
            int temp = arr[i];
            arr[i] = max;
            if(max<temp){
                max = temp;
            }
            i--;
        }

        for(int a: arr)
            System.out.println(a);
        return arr;
    }
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide sol = new ReplaceElementsWithGreatestElementOnRightSide();
        System.out.println(sol.replaceElements(new int[]{57010,40840,69871,14425,70605})); // ans: [70605,70605,70605,70605,-1]
        System.out.println(sol.replaceElements(new int[]{17,18,5,4,6,1})); // ans: [18,6,6,6,1,-1]
    }

}
