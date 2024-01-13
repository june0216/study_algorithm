package 프로그래머스.문자열.문자열;

public class 크기가작은문자열 {
	public int solution(String t, String p) {
		int answer = 0;

		for(int i = 0; i < t.length()-p.length()+1; i++){
			long temp = Long.parseLong(t.substring(i, i + p.length()));
			if(Long.valueOf(temp) <= Long.valueOf(p)){
				answer +=1;
			}
		}
		return answer;
	}
}
