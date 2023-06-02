package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어필터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);

		int limSize = Integer.parseInt(st.nextToken());
		int wordSize=Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder(input);
		String lim = br.readLine();
		String word = br.readLine();
		while (word.contains(lim)) {
			word = word.replaceFirst(lim, "");
		}

		if(word.isEmpty()){
			System.out.println("EMPTY");
		}
		else{
			System.out.println(word);
		}

	}
}
