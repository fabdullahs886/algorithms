package com.problems.easy;

public class ReverseStringII {
    private String reverseStr(String s, int k) {
        if(s.trim().length() == 0) return s;

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i += 2*k){
                int pointer1 = i;
                int pointer2 = Math.min(i + k -1, arr.length - 1);
                while(pointer1 < pointer2){
                    char tmp = arr[pointer1];
                    arr[pointer1] = arr[pointer2];
                    arr[pointer2] = tmp;
                    pointer1++;
                    pointer2--;
                }
        }
        return new String(arr);
    }

    public static void main(String[] args){
        ReverseStringII obj = new ReverseStringII();
        System.out.println(obj.reverseStr("krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc" , 20)); // "jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphccxfsogsgqsnvckjvnskk"
        System.out.println(obj.reverseStr("abcdefg", 2)); // "bacdfeg"
        System.out.println(obj.reverseStr("abcd", 2)); // "bacd"
        System.out.println(obj.reverseStr("a", 2)); // "a"
        System.out.println(obj.reverseStr("", 20)); // ""
        System.out.println(obj.reverseStr("abcdefg", 3)); // "cbadefg"
        System.out.println(obj.reverseStr("abcdefg", 7)); // "gfedcba"
        System.out.println(obj.reverseStr("abcdefg", 9)); // "gfedcba"
    }
}
