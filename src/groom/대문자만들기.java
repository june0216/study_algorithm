package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 대문자만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int total = Integer.parseInt(input);
		String word = br.readLine();
		StringBuilder swappedCase = new StringBuilder();
		for (char c : word.toCharArray()) {
			if(Character.isUpperCase(c)){
				swappedCase.append(Character.toLowerCase(c));
			}
			else{
				swappedCase.append(Character.toUpperCase(c));
			}
		}
		System.out.println(swappedCase.toString());
	}
}
