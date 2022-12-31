package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4796_Camping {
    static int cases;
    static int cnt;
    static int result;
    static int l;
    static int p;
    static int v;

    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        cases = 0;
        while(true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if(l == 0 && p == 0 && v == 0) // 반복문 종료 조건
                break;
            cnt++;
            result = ((v/p)*l) + Math.min(l, v%p);
            System.out.println("Case " + ++cases + ":"+result);

        }
    }

}
