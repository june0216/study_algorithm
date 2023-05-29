package 프로그래머스_고득점키트.DFS;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵_bfs {
	private int n;
	private int m;
	private int[][] map;
	private boolean[][] visited;
	private int[] dx = {0, 0, -1, 1};
	private int[] dy = {-1, 1, 0, 0};


	public int solution(int[][] maps) {
		map = maps;
		int result= bfs();
		return result;
	}

	private int bfs(){
		Queue<Node> qu = new LinkedList<>();
		qu.offer(new Node(0, 0, 1));
		visited[0][0] = true;

		while(qu.isEmpty()){
			Node no = qu.poll();
			int x=no.x;
			int y = no.y;
			int length = no.length;

			if(x == n-1 && y == m-1){
				return length;
			}
			for(int i = 0; i < 4; i++){
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				if(isValid(nx, ny) && map[ny][nx] ==1&& !visited[ny][nx]){
					qu.offer(new Node(nx, ny , length +1));
					visited[ny][nx] = true;
				}
			}


		}
		return -1;
	}
	private boolean isValid(int x, int y){
		if(x >= 0 && x < n && y >=0 && y <m){
			return true;
		}
		return false;
	}
	private static class Node{
		int x;
		int y;
		int length;

		public Node(int x, int y, int length){
			this.x = x;
			this.y = y;
			this.length = length;
		}
	}

}
