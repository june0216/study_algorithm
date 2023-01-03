package 프로그래머스_LV0;

class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int line1 = 0;
        int line2 = 0 ;
        for(int i = 1; i < dots.length; i++)
        {
            if(dots[0][1] != dots[i][1]){
                line1 =  Math.abs(dots[0][1] - dots[i][1]);
                if(dots[0][0] != dots[i][0])
                    line2 = Math.abs(dots[0][0] - dots[i][0]);
            }

        }
        return line1*line2;
    }
}
