package 프로그래머스_LV0;

import java.io.IOException;

public class 최빈값구하기 {
    public static void main(String[] arg) throws IOException{
        int arr[] = {1, 1, 2, 2};
        System.out.println(solution(arr));
    }
    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int arr[] = new int[1001];
        boolean s = false;
        for(int i = 0; i < array.length; i++)
        {
            arr[array[i]] += 1;
            System.out.println(arr[array[i]]);
        }
        for(int i = 0; i < arr.length; i++)
        {

            if(max != i && arr[max] != 0 && arr[max] == arr[i]){
                s = true;
            }
            else if(arr[max] < arr[i]){
                max = i;
                System.out.println("한 번");
                s = false;
            }
        }
        if(s) return -1;
        else answer = max;
        return answer;
    }
}
