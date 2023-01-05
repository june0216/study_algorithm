package 프로그래머스_LV1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] arg) {

    }
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for(int j = 0; j < strings.length; j++)
        {
            char min = strings[j].charAt(n);
            int minIndex = j;
            for(int i = 0 ; i < strings.length; i++)
            {
                if( strings[i].charAt(n) > strings[j].charAt(n)){
                    String temp = strings[minIndex];
                    strings[minIndex] = strings[i];
                    strings[i] = temp;

                }
                if(strings[i].charAt(n) == strings[j].charAt(n)){
                    List<String> list = Arrays.asList(strings[i], strings[j]);
                    Collections.sort(list);
                    strings[i] = list.get(0);
                    strings[j] = list.get(1);

                }
            }
        }
        return strings;
    }

}
