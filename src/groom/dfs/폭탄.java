package groom.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 폭탄 {	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	StringTokenizer st = new StringTokenizer(input);
	Integer N = Integer.parseInt(st.nextToken());
	Integer bom = Integer.parseInt(st.nextToken());
	int[] nx = {0, 0, -1, 1};
	int[] ny = {-1, 1, 0, 0};
	int result = 0;
	for(int i = 0; i < N; i++){
		input = br.readLine();
		st = new StringTokenizer(input);
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		for(int j = 0; j < 4; j++){
			int dx = nx[j] + x;
			int dy = ny[j] + y;
			if(1 <= dx && dx < N+1 && 1 <= dy && dy > N+1 ){
				result +=1;
			}
		}

	}
	System.out.println(result);
}
}
