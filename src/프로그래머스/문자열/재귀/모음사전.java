package 프로그래머스.문자열.재귀;

import java.util.*;
import java.io.*;
class 모음사전 {
    /*상태 = 문자열
    종료 조건 = 길이가 5개 되면 종료
    점화식 = word = word + "A", word+ "E"..+ word+ "U"
    */
    private static List<String> words = new ArrayList<>();
    private static final char[] CHARS = "AEIOU".toCharArray();

    private void makeWord(String word){
        if(word.length() ==5) return;

        for(char c : CHARS){
            words.add(word+c);
            makeWord(word+c);

        }
    }
    public int solution(String word) {
        makeWord("");
        return words.indexOf(word)+1;
    }
}
