package com.problems.easy;

public class ReplaceAllAvoidConsecutiveRepeatingCharacters {
    private String modifyString(String s) {
        if( s.length() == 1){
            if(s.equals("?"))
                return "a";
        }

        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if( i == 0 && ch[i] == '?'){
                char letter = getLetter('0', ch[i+1]);
                ch[i] = letter;
            }else if(i == ch.length - 1 && ch[i] == '?'){
                char letter = getLetter(ch[i-1],'0');
                ch[i] = letter;
            }else if (ch[i] == '?'){
                char letter = getLetter(ch[i-1],ch[i+1]);
                ch[i] = letter;
            }
        }

        String str = new String(ch);
        return str;

    }

    private char getLetter(char s1, char s2){
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] l = str.toCharArray();
        for( char letter: l){
            if ( letter != s1 && letter != s2)
                return letter;
        }
        return '0';
    }

    public static void main(String[] args){
        ReplaceAllAvoidConsecutiveRepeatingCharacters obj = new ReplaceAllAvoidConsecutiveRepeatingCharacters();
        System.out.println(obj.modifyString("?zs")); //"azs"
        System.out.println(obj.modifyString("ubv?w")); // "ubvaw"
        System.out.println(obj.modifyString("j?qg??b")); // "jaqgacb"
        System.out.println(obj.modifyString("??yw?ipkj?")); // "acywaipkja"
    }
}
