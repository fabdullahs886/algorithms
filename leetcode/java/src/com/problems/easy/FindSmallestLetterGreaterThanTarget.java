package com.problems.easy;

public class FindSmallestLetterGreaterThanTarget {
    private char nextGreatestLetter(char[] letters, char target) {
        return solution3(letters,target);
    }

    private char solution3(char[] letters, char target){
        int low = 0;
        int high = letters.length - 1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(letters[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        int n = low%letters.length;
        return letters[n];
    }

    private char solution2(char[] letters, char target){
        for(char c: letters){
            if( c > target)
                return c;
        }
        return letters[0];
    }

    private char solution1(char[] letters, char target){
        char result = 'a';

        for(int i = 0; i < letters.length; i++){
            if((int)letters[i] < (int)target){
                continue;
            }else if((int)letters[i] == (int)target){
                if(i == letters.length - 1) {
                    return letters[0];
                }else {
                    if(letters[i+1] == target)
                        continue;
                    return letters[i + 1];
                }
            }else{
                return letters[i];
            }
        }

        return letters[0];
    }

    public static void main(String[] args){
        FindSmallestLetterGreaterThanTarget obj = new FindSmallestLetterGreaterThanTarget();
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a')); // 'c'
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c')); // 'f'
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd')); // 'f'
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g')); // 'j'
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j')); // 'c'
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k')); // 'c'
        System.out.println(obj.nextGreatestLetter(new char[]{'e','e','e','e','e','e','n','n','n','n'}, 'e')); // 'n'
    }
}
