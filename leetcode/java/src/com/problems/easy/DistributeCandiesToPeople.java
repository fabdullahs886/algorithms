package com.problems.easy;

import java.util.Arrays;

public class DistributeCandiesToPeople {
    int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int index = 0;
        int count = 1;
        while(candies > 0){
            if(candies > count)
                ans[index%num_people] += count;
            else
                ans[index%num_people] += candies;
            candies -= count;
            count++;
            index++;

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        DistributeCandiesToPeople obj = new DistributeCandiesToPeople();
        System.out.println(obj.distributeCandies(7, 4)); //  [1,2,3,1]

        System.out.println(obj.distributeCandies(10, 3)); //  [5,2,3]
    }

}
