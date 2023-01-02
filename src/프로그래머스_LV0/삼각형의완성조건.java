package 프로그래머스_LV0;

public class 삼각형의완성조건 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int min = 0;
        int sum = sides[0] + sides[1];
        if(sides[0] > sides[1])
        {
            max = sides[0];
            min = sides[1];
        }
        else
        {
            max = sides[1];
            min = sides[0];
        }

        answer = ((sum - max) -1);
        answer = answer + max - (max - min);
        return answer;
    }
}
