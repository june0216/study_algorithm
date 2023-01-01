package ExhaustiveSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10974_모든순열 {
    static int num;
    static int[] arr;
    static int[] output;
    static boolean visited[];
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        arr = new int[num];
        visited = new boolean[num];
        output = new int[num];

        for (int i = 0; i < num; i++) {
            visited[i] = true;
            DFS(arr, visited, num, i, 0);
            visited[i] = false;
        }


    }

    public static void DFS(int[] arr, boolean[] visited, int num, int i, int depth){
        output[depth] = i + 1;
        if (depth == num - 1) {
            for (int j = 0; j < num; i++)
                System.out.print(output[j] + " ");
            System.out.println();
            return;
        }
        for (int j = 0; j < num; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            DFS(arr, visited, num, j, depth + 1);
            visited[j] = false;
        }
    }

}
