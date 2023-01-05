package 프로그래머스_LV1;

import java.io.IOException;

public class 문자열다루기기본 {
    public static void main(String[] arg) throws IOException{
        System.out.println(solution("1234"));
    }
    public static boolean solution(String s) {
        boolean answer = true;
        char arr[] = s.toCharArray();
        System.out.println(arr.length);
        if(arr.length != 4 && arr.length != 6)
        {
            return false;}

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '0' || arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' || arr[i] == '5' || arr[i] == '6' || arr[i] == '7'|| arr[i] == '8' || arr[i] == '9')
            {


            }else
            {
                return false;
            }
        }
        answer = true;
        return answer;
    }
}

/*        import java.util.*;

class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}*/
