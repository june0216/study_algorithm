package ExhaustiveSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import org.w3c.dom.Node;

public class Re {

	static int n;
	static int m;
	static String[][] map;
	static int totalBall;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		for(int i = 0; i < total; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			totalBall = 0;
			map = new String[n][m];
			for(int j = 0; j < n; j++){
				String temp = br.readLine();
				String[] check = temp.split("");
				for(int k = 0; k < m; k++){
					if(check[k].equals("R") || check[k].equals("B")) {
						totalBall += 1;
					}
					map[j][k] = check[k];
				}
			}
			visited = new boolean[n][m];
			System.out.println("#" + (i+1) + " " + bfs());
		}
	}

	static int bfs(){
		visited[0][0] = true;
		Queue<Node> qu = new LinkedList<>();
		qu.offer(new Node(0, 0, 1, 0));

		while(!qu.isEmpty()) {
			Node no = qu.poll();
			int x = no.x;
			int y = no.y;
			int length = no.length;
			int ball = no.ball;

			if(x == n-1 && y == m-1 && ball == totalBall){
				return length;
			}
			for(int w = 0; w < 4; w++){
				int nx = dx[w] + x;
				int ny = dy[w] + y;
				if(map[ny][nx].equals("X")) continue;
				if(isValid(nx, ny) && !visited[ny][nx]){
					if(map[ny][nx].equals("R") || map[ny][nx].equals("B")){
						qu.offer(new Node(nx, ny, length + 1, ball+1));
					}
					else {
						qu.offer(new Node(nx, ny, length + 1, ball));
					}
					visited[ny][nx] = true;
				}
			}
		}
		return -1;
	}

	static boolean isValid(int x, int y){
		return x >= 0 && x < m && y >= 0 && y < n;
	}

	static class Node{
		int x;
		int y;
		int length;
		int ball;

		public Node(int x, int y , int length, int ball){
			this.x = x;
			this.y = y;
			this.length = length;
			this.ball = ball;
		}
	}

}
