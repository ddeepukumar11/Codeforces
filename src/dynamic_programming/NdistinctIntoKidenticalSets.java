package dynamic_programming;

import java.util.Scanner;

public class NdistinctIntoKidenticalSets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		System.out.println(solution(n, k));

	}

	private static int solution(int n, int k) {
		int dp[][] = new int[k + 1][n + 1];
		for(int i = 1; i <= k;i++){
			for(int j = i; j <= n;j++){
				if(i == 1 || i == j){
					dp[i][j] = 1;
				}else
				dp[i][j] = dp[i - 1][j - 1] + (i * dp[i][j - 1]);
			}
		}
		return dp[k][n];
	}

}
