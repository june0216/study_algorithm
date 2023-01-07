package 프로그래머스_LV1;

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String arg[])
    {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] numbers) {
        int[] answer;
        int cnt = 0;
        int res = 1;
        HashSet<Integer> map = new HashSet<Integer>();


        int i = 0;
        while(i < numbers.length-1)
        {
            int j = i+1;
            while(j < numbers.length)
            {
                map.add(numbers[i] + numbers[j]); //HashSet 특성상 중복된 값 들어갈 수 없음
                j++;

            }
            i++;


        }
        answer = new int[map.size()];
        Iterator<Integer> it = map.iterator();
        int count = 0;
        while(it.hasNext())
        {
            answer[count] = it.next();
            count++;
        }

        Arrays.sort(answer);




        return answer;
    }
}
