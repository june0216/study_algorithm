package 프로그래머스.문자열.문자열;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		Map<Integer, String> rank = new HashMap<>();
		Map<String, Integer> player = new HashMap<>();
		for(int i = 0; i < players.length; i++){
			rank.put(i+1, players[i]);
			player.put(players[i], i+1);
		}
		for(String call:callings){
			int curRank = player.get(call);
			String frontPlayer = rank.get(curRank-1);
			rank.put(curRank-1, call);
			player.put(call, curRank-1);
			rank.put(curRank, frontPlayer);
			player.put(frontPlayer, curRank);

		}
		for(int n = 0; n < players.length;n++){
			answer[n] = rank.get(n+1);
		}
		return answer;
	}
}
