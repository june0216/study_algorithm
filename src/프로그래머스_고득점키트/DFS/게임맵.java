package 프로그래머스_고득점키트.DFS;

public class 게임맵 {
	private int n;
	private int m;
	private int[][] map;
	private boolean[][] visited;
	private int shortestPath;

	public int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;
		map = maps;
		visited = new boolean[n][m];
		shortestPath = Integer.MAX_VALUE;

		// DFS 탐색 시작
		dfs(0, 0, 1);

		if (shortestPath == Integer.MAX_VALUE) {
			return -1;  // 경로가 없는 경우
		} else {
			return shortestPath;
		}
	}

	private void dfs(int x, int y, int pathLength) {
		// 목적지에 도착한 경우, 최단 경로 갱신
		if (x == n - 1 && y == m - 1) {
			shortestPath = Math.min(shortestPath, pathLength);
			return;
		}

		visited[x][y] = true;

		// 상하좌우 이동
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// 다음 위치가 범위 내에 있고, 벽이 아니며, 방문하지 않은 경우에만 이동
			if (isValid(nx, ny) && map[nx][ny] == 1 && !visited[nx][ny]) {
				dfs(nx, ny, pathLength + 1);
			}
		}

		visited[x][y] = false;
	}

	private boolean isValid(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
