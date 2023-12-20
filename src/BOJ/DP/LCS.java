package BOJ.DP;

import java.io.*;
public class LCS {
    static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word1 = br.readLine().toCharArray();
        char[] word2 = br.readLine().toCharArray();
        int[][] dp = new int[word1.length+1][word2.length+1];
        for(int i = 1; i < word1.length+1; i++){
            for(int j = 1; j < word2.length+1; j++){
                if(word2[j-1] == word1[i-1]){
                    dp[i][j] += dp[i-1][j-1] +1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[word1.length][word2.length]);

    }
    public static void main(String[] args) throws Exception{
        new BOJ.DP.LCS().solution();
    }
}
