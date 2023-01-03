package 프로그래머스_LV0;

import java.io.IOException;

public class 문자열밀기 {
    public static void main(String[] arg) throws IOException {
        System.out.println(solution("heehhh", "hheehh"));


    }
    public static int solution(String a, String b) {
        //실패 케이스 -> 같은 문자가 나열되어있을 경우 고려하지 못한다.
        /*int cnt = 0;
        int v = 0;
        int j = 0;
        int res = 0;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        while (true) {
            if (arrB[(cnt%arrB.length)] == arrA[j]) {
                if(j == 0) {
                    v = 1;
                    res = (cnt%arrB.length);

                }
                if (j == (arrB.length - 1)) {
                    return res;
                }
                j = j+1;

            } else {
                if (v == 1)
                    return -1;
                if(j == (arrB.length - 1))
                    return -1;
            }
            cnt = cnt +1;

        }
        }
*/
        int answer = 0;


        String tA = a;
        for (int i = 0; i < a.length(); i++) {
            if (tA.equals(b)) {
                return answer;
            }
            String A = tA.substring(tA.length() - 1);
            tA = A + tA.substring(0, tA.length() - 1);
            answer++;
        }

        return -1;
    }




}

