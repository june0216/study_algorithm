package 프로그래머스_LV1;

import java.util.Arrays;

public class 오름차순정렬 {
    public static void main(String[] arg){
        System.out.println(solution(1111889));
    }
    public static long solution(long n) {
        long answer = 0;
        long num = 10;
        String s = String.valueOf(n);;
        long[] arr = new long[s.length()];
        int i = 0;
        
        while(i < s.length())
        {
            long temp = (n % num);
            n = n/num;

            arr[i] = temp;
            System.out.println(temp);

            i++;
        }
        Arrays.sort(arr);
        num = 1;
        for(int j = arr.length-1; j>0; j--)
        {
            answer = answer + num*arr[j];
            num = num * 10;
        }
        return answer;
    }
}
