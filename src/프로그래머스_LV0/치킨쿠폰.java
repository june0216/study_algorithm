package 프로그래머스_LV0;

import java.io.IOException;

public class 치킨쿠폰 {
    static int answer = 0;
    static int coup;
    static int remain = 0;
    public static void main(String[] arg) throws IOException {
        System.out.println(solution(100));
    }
    public static int solution(int chicken) {
        int answer = 0;
        int coup;
        int remain = 0;



        if(chicken  < 10) return 0;

        while(true) {
            answer = answer + (chicken / 10);
            remain = remain + (chicken % 10);
            chicken = chicken / 10;
            if (chicken < 10) {
                remain = remain + chicken;
                while (true) {
                    answer = answer + (remain / 10);
                    remain = remain / 10;
                    if (remain < 10) {
                        break;
                    }

                    remain = remain + (remain % 10);
                }
                return answer;
            }
        }
    }

    /*public static int solution(int chicken) {
        if (chicken <= 1) {
            remain = remain + chicken;
            while (true) {
                if(remain > 0 && remain < 9)
                {
                    break;
                }
                answer = answer + (remain / 10);
                remain = remain + (remain % 10) + (remain / 10);
            }
            return answer;
        }
        answer = answer + (chicken / 10);
        remain = remain + (chicken % 10) + (chicken / 10);
        return solution(chicken/ 10);
    }*/
}



