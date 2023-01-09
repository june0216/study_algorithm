package 프로그래머스_LV1;

public class 다트게임 {
    public static void main(String arg[]){
        System.out.println(solution("1D*2D3T"));
    }
    public static int solution(String dartResult) {
        int answer = 0;
        int num = 0;
        int preset = 0;
        int temp = 0;
        for(int i = 0; i < dartResult.length(); i++)
        {
            if(dartResult.charAt(i) == 'S')
            {
                answer = answer + num;

                temp = num;
                num = 0;//초기화
            }
            else if(dartResult.charAt(i) == 'D'){
                temp =  num*num;

                answer = answer + temp;
                num = 0;
            }
            else if(dartResult.charAt(i) == 'T')
            {
                temp =  num* num * num;


                answer = answer + temp;

                num = 0;
            }
            else if(dartResult.charAt(i) == '*')
            {
                answer = (answer - (preset +temp)) + preset * 2 +temp * 2;

                temp = temp * 2;


            }
            else if(dartResult.charAt(i) == '#'){

                answer = (answer - temp) + temp* -1;
                temp = temp * -1;

            }
            else
            {
                preset = temp;
                if(num == 1){
                    num = 10;
                }
                else
                {
                    num = Character.getNumericValue(dartResult.charAt(i));
                }

            }
        }
        return answer;
    }
}
