package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RearrangeSpacesBetweenWords {
    private String reorderSpaces(String text) {

        int spaceCount = 0;
        List<String> wordList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()){
            if ( c == ' ')
                spaceCount++;
        }

        if (spaceCount == 0)
            return text;

        String[] list = text.split("\\s+");
        for(String el: list){
            if(el.trim().length() > 0)
                wordList.add(el);
        }
//        System.out.println(wordList);
        int wordCount = wordList.size();
//        System.out.println("Word Count : " + wordCount);

        if( wordCount == 1){
            sb.append(wordList.get(0)).append(" ".repeat(spaceCount));
            return sb.toString();
        }

        int noOfSpaces = spaceCount/(wordCount - 1);
        for(String word: wordList){
            sb.append(word);
            sb.append(" ".repeat(noOfSpaces));
            spaceCount -= noOfSpaces;
        }
        spaceCount += noOfSpaces;
        sb.delete(sb.length() - noOfSpaces,sb.length());
//        System.out.println(sb.toString());
        if( spaceCount > 0){
            sb.append(" ".repeat(spaceCount));
        }


        return sb.toString();

    }

    public static void main(String[] args){
        RearrangeSpacesBetweenWords obj = new RearrangeSpacesBetweenWords();
        System.out.println(obj.reorderSpaces("  this   is  a sentence ")); // "this   is   a   sentence"
        System.out.println(obj.reorderSpaces("hello   world")); // "hello   world"
        System.out.println(obj.reorderSpaces(" practice   makes   perfect")); // "practice   makes   perfect "
        System.out.println(obj.reorderSpaces("  walks  udp package   into  bar a")); // "walks  udp  package  into  bar  a "
        System.out.println(obj.reorderSpaces("a")); // "a"
    }
}
