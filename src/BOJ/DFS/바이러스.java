package BOJ.DFS;

import java.util.*;
import java.io.*;

public class 바이러스 {
    public static void main(String[] args) throws Exception {
        new 바이러스().solution();
    }
    int result;

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int relation = Integer.parseInt(br.readLine());
        List<Integer>[] aToB = new List[node+1];
        for (int i = 1; i <= node; i++) {
            aToB[i] = new ArrayList<>();
        }
        boolean[] v = new boolean[node+1];
        int cnt = relation;
        result = 0;
        while(cnt--> 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            aToB[a].add(b);
            aToB[b].add(a);


        }
        dfs(1, aToB, v);
        System.out.println(result);

    }
    private void dfs(final int idx, final List<Integer>[] edge, final boolean[] v){
        v[idx] = true;
        for(int num : edge[idx]){
            if(v[num] == false){
                dfs(num, edge, v);
                result++;
            }
        }
    }

}
