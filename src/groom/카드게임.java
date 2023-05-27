package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 카드게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(input);
		int type = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		ArrayList<Integer> li = new ArrayList();
		for(int i = 0; i < type; i++){
			li.add(0);
		}
		int cnt = 1;
		int res = -1;
		boolean flag = true;
		int sum =0;

		for(int j= 0; j < total; j++)
		{
			input = br.readLine();
			int ind = Integer.parseInt(input) - 1;
			if(li.get(ind) == 0){
				li.set(ind, 1);
				sum +=1;
			}


			if(sum == type && flag)
			{
				res = cnt;
				flag = false;
			}
			cnt +=1;

		}


		System.out.println(res);
	}

}
