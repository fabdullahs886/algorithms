package com.problems.easy;

public class PeakIndexInMountainArray {
    private int peakIndexInMountainArray(int[] arr) {
        return solution2(arr);
    }

    private int solution2(int[] arr){
        int low = 0, high = arr.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
    private int solution1(int[] arr){
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();
        System.out.println(obj.peakIndexInMountainArray(new int[]{0,1,0})); // 1
        System.out.println(obj.peakIndexInMountainArray(new int[]{0,2,1,0})); // 1
        System.out.println(obj.peakIndexInMountainArray(new int[]{0,10,5,2})); // 1
        System.out.println(obj.peakIndexInMountainArray(new int[]{3,4,5,1})); // 2
        System.out.println(obj.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19})); // 2
    }
}
