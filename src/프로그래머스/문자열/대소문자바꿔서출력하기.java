package 프로그래머스.문자열;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String result = "";
		for(int i = 0; i < a.length(); i++){
			char c = a.charAt(i);
			if(c < 'a'){
				result += String.valueOf(c).toLowerCase();
			}
			else{
				result += String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(result);
	}
}
