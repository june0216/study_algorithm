package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 피보나치 {
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	long[] dp = new long[Math.max(n + 1, 3)];
	dp[1] = 0;
	dp[2] = 1;
	for (int i = 3; i <= n; i++) {
		dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
	}
	System.out.println(dp[n]);
}
}
