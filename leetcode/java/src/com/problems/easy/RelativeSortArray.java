package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeSortArray {
    private int[] relativeSortArray(int[] arr1, int[] arr2) {
        return solution1(arr1,arr2);
    }

    private int[] solution2(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        List<Integer> list = new ArrayList<Integer>();
        int k = 0;
        for(int i = 0; i < arr2.length;i++){
            int num = arr2[i];
            for(int j = 0; j < arr1.length;j++){
                if(arr1[j] == num) {
                    result[k] = num;
                    k++;
                }
            }
        }

        for(int num1: arr1){
            boolean found = false;
            for(int num2: arr2){
                if(num1 == num2){
                    found = true;
                    break;
                }
            }
            if(!found)
                list.add(num1);
        }
        Collections.sort(list);
        for(Integer num: list){
            result[k] = num;
            k++;
        }

        return result;
    }

    private int[] solution1(int[] arr1, int[] arr2){
        int[] map=new int[1001];

        for(int ele:arr1)
            map[ele]++;

        int k=0;
        for(int ele:arr2){
            while(map[ele]!=0){
                arr1[k]=ele;
                k++;
                map[ele]--;
            }
        }

        for(int i=0;i<map.length;i++){
            if(map[i]>0){
                while(map[i]!=0){
                    arr1[k]=i;
                    k++;
                    map[i]--;
                }
            }
        }

        return arr1;
    }

    public static void main(String[] argv){
        RelativeSortArray obj = new RelativeSortArray();
        System.out.println(Arrays.toString(obj.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}))); // [2,2,2,1,4,3,3,9,6,7,19]
    }
}
