package BOJ.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {
    public static void main(String[] args) throws Exception {
        new BOJ.DFS.바이러스().solution();
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
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        v[1] = true;
        while(!que.isEmpty()){
            int start = que.poll();
            for(int num : aToB[start]){
                if(v[num] == false){
                    que.add(num);
                    v[num] = true;
                    result++;
                }
            }
        }
        System.out.println(result);

    }

}
