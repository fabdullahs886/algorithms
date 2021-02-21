package com.problems.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class NRepeatedElementInSize2NArray{
	
	private int repeatedNTimes(int[] A) {



         int num = A.length/2;
         Map<Integer, Integer> map = new HashMap<Integer,Integer>();
         for(int i = 0; i < A.length; i++){
         	if(map.get(A[i]) == null){
         		map.put(A[i], 1);
         	}else{
         		int n = map.get(A[i]);
         		map.put(A[i], ++n);
         	}
         }

         for(int key: map.keySet()){
         	if( map.get(key) == num)
                 return key;
         }
         return 0;
    }

    public static void main(String[] args){
        NRepeatedElementInSize2NArray obj = new NRepeatedElementInSize2NArray();
        System.out.println(obj.repeatedNTimes(new int[]{1,2,3,3}));    //  3
        System.out.println(obj.repeatedNTimes(new int[]{2,1,2,5,3,2}));    //  2
        System.out.println(obj.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));    //  5
    }

}