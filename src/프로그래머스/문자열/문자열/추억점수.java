package 프로그래머스.문자열.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class 추억점수 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Read the number of names
		int n = Integer.parseInt(br.readLine().trim());

		// Read names
		String[] name = new String[n];
		for (int i = 0; i < n; i++) {
			name[i] = br.readLine().trim();
		}

		// Read yearnings
		int[] yearning = new int[n];
		String[] yearningStr = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) {
			yearning[i] = Integer.parseInt(yearningStr[i]);
		}

		// Read the number of photo arrays
		int p = Integer.parseInt(br.readLine().trim());

		// Read photo arrays
		String[][] photo = new String[p][];
		for (int i = 0; i < p; i++) {
			String[] photoLine = br.readLine().trim().split(" ");
			photo[i] = photoLine;
		}

		// Call solution
		int[] result = solution(name, yearning, photo);

		// Print the result
		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> score = new HashMap<>();
		for(int i = 0; i < name.length; i++){
			score.put(name[i], yearning[i]);
		}
		for(int j = 0; j < photo.length; j++){
			int temp =0;
			for(String photoName : photo[j]){
				if (score.containsKey(photoName)) {
					temp += score.get(photoName);
				} else {
					// 적절한 에러 처리 또는 로깅
					System.err.println("Name not found in score map: " + photoName);
				}

			}
			answer[j] = temp;
		}

		return answer;
	}
}