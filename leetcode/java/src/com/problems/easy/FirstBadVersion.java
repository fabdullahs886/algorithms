package com.problems.easy;

public class FirstBadVersion {
    private int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low < high){
            int mid = low + (high - low)/2;
            boolean res = isBadVersion(mid);
            if(!res){
                low = mid + 1;
            }else if(res){
                high = mid;
            }
        }

        return low;
    }

    private boolean isBadVersion(int version){
        return version == 4;
    }

    public static void main(String[] args){
        FirstBadVersion obj = new FirstBadVersion();
        System.out.println(obj.firstBadVersion(5));
    }
}
