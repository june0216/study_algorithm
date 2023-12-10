package BOJ.다익스트라;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.*;
import java.util.StringTokenizer;


public class 택배배송 {

    public static void main(String[] args) throws Exception {
        new BOJ.다익스트라.택배배송().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int relation = Integer.parseInt(st.nextToken());
        List<Node>[] route = new List[node+1];
        for(int i = 0; i < node+1; i++){
            route[i] = new ArrayList<>();
        }
        while(relation-- > 0){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            route[n1].add(new Node(weight, n2));
            route[n2].add(new Node(weight, n1));

        }

        PriorityQueue<Node> pq = new PriorityQueue<>(); // 우선순위 큐
        pq.add(new Node(0, 1));
        int minValue[] = new int[node+1];
        Arrays.fill(minValue,50000001);


        while(!pq.isEmpty()){
            Node now = pq.poll();

            if(now.nodeNum == node){
                System.out.println(now.weight);
                break;
            }
            for(Node next : route[now.nodeNum]){
                if(minValue[next.nodeNum] > now.weight+next.weight){
                    minValue[next.nodeNum] = now.weight+next.weight;
                    pq.offer(new Node(next.weight+now.weight, next.nodeNum));
                }
            }
        }


    }
    class Node implements Comparable<Node> { // class
        int weight;
        int nodeNum;

        public Node(int weight, int nodeNum) {
            this.weight = weight;
            this.nodeNum = nodeNum;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
}
