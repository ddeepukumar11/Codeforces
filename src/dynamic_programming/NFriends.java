package dynamic_programming;

import java.util.Scanner;

public class NFriends {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println(solution(n));
	}

	private static int solution(int n) {
		int[] dp = new int[n + 1];
		dp[1] = 1; 
		dp[2] = 2;
		for(int i = 3;i <= n;i++){
			dp[i] = dp[i - 1] + ((i - 1) * dp[i - 2]); 
		}
		return dp[n];
	}

}
