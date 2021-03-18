package com.wy.athena.simple;

/**
 * 描述:
 *
 * @author xjh
 * created on 2021-03-18 8:43 下午
 */
public class No058lengthOfLastWord最后一个单词的长度 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world my god"));
    }

    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if(end < 0) {
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
