package 프로그래머스_고득점키트.DFS;

public class 타겟넘버찾기 {
	int answer = 0;
	public int solution(int[] numbers, int target) {


		cal(numbers, 0, target, 0);
		return answer;
	}
	public void cal(int[] numbers, int idx, int target, int sum){
		if(idx == numbers.length){
			if(target == sum){
				answer +=1;
			}
			return;
		}
		cal(numbers, idx +1, target, sum + numbers[idx]);
		cal(numbers, idx +1, target, sum - numbers[idx]);
	}



}
