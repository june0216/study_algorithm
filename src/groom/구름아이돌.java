package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 구름아이돌 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int total = Integer.parseInt(input);
		input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		List<Integer> li = new ArrayList();
		for(int i = 0; i < total; i++){
			li.add(Integer.parseInt(st.nextToken()));
		}
		for(int j = 0 ; j < 3; j++){
			int max= Collections.max(li);
			int idx = li.indexOf(max);
			System.out.print(idx+1 + " ");
			li.set(idx, -1);
		}

	}
}
