package BOJ.DP;
import java.util.*;
import java.io.*;

public class RGB거리 {
    public static void main(String[] args) throws Exception{
        new BOJ.DP.RGB거리();
    }

    static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[][] money = new int[num][3];
        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            money[i][0] = r;
            money[i][1] = g;
            money[i][2] = b;
        }

        for(int i = 1; i < num; i++){
            money[i][0] += Math.min(money[i-1][1], money[i-1][2]);
            money[i][1] = Math.min(money[i-1][0], money[i-1][2]);
            money[i][2] = Math.min(money[i-1][1], money[i-1][0]);
        }
        System.out.println(Math.min(Math.min(money[num-1][0], money[num-1][1]), money[num-1][2]));
    }

}
