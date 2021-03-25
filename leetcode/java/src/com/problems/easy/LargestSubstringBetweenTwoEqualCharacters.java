package com.problems.easy;

public class LargestSubstringBetweenTwoEqualCharacters {
    private int maxLengthBetweenEqualCharacters(String s) {
        char[] chars = s.toCharArray();
        // 'i' represents size of sliding window
        for(int i = chars.length - 1; i  >=  0; i--) {
            for(int j = 0; j + i < chars.length; j++) {
                if(chars[i + j] == chars[j]) {
                    return i - 1;
                }
            }
        }
        return -1;
//        int result = -1;
//        for(int i = 0; i < s.length(); i++){
//            int count = 0;
//            int times = 0;
//            char c = s.charAt(i);
//            times = s.lastIndexOf(c);
//            count = times - i - 1;
//            if(count > result)
//                result = count;
//        }
//        return result;
    }

    public static void main(String[] args){
        LargestSubstringBetweenTwoEqualCharacters obj = new LargestSubstringBetweenTwoEqualCharacters();
//        System.out.println(obj.maxLengthBetweenEqualCharacters(("mgntdygtxrvxjnwksqhxuxtrv"))); // 18
        System.out.println(obj.maxLengthBetweenEqualCharacters(("aa"))); // 0
        System.out.println(obj.maxLengthBetweenEqualCharacters(("abca"))); // 2
        System.out.println(obj.maxLengthBetweenEqualCharacters(("cbzxy"))); // -1
        System.out.println(obj.maxLengthBetweenEqualCharacters(("cabbac"))); // 4
    }
}
