package 프로그래머스_LV0;

public class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {


        int[] answer = {0, 0};
        int max = board[0] /2;
        int min = -(board[0]/2);
        int max1 = board[1] /2;
        int min1 = -(board[1]/2);
        for(int i = 0; i < keyinput.length; i++)
        {
            if(keyinput[i].equals("left"))
            {
                if(answer[0] <= min){continue;}
                else{answer[0]--;}
            }
            else if(keyinput[i].equals("right")) {
                if(answer[0] >= max){continue;}
                else{answer[0]++;}
            }
            else if(keyinput[i].equals("up")) {
                if(answer[1] >= max1){continue;}
                else{answer[1]++;}
            }
            else if(keyinput[i].equals("down")){
                if(answer[1] <= min1){continue;}
                else{answer[1]--;}
            }
        }

        return answer;
    }
}
