package 프로그래머스_고득점키트.DFS;

public class 네트워크 {
	int[][] computer;
	int result;
	boolean[] visited;
	int num = computer.length;
	int m = computer[0].length;

	public int solution(int n, int[][] computers) {
		visited = new boolean[n];
		for(int k = 0; k < num; k++){
			dfs(k);
		}

		return result;
	}

	public void dfs(int k){
		if(visited[k] == false){
			for(int i = 0; i < num; i++){
				if(computer[k][i] == 1){
					visited[i] = false;
					result +=1;
				}
			}
		}

	}
}
