package dynamic_programming;

import java.util.Scanner;

public class LCStriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		String s3 = scn.nextLine();

		System.out.println(solution(s1, s2, s3));
	}

	private static int solution(String s1, String s2, String s3) {
		int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];
		for(int i = s1.length() - 1;i >= 0;i--){
			char ch1 = s1.charAt(i);
			for(int j = s2.length() - 1;j >= 0;j--){
				char ch2 = s2.charAt(j);
				for(int k = s3.length() - 1;k >= 0;k--){
					char ch3 = s3.charAt(k);
					
					if(ch1 == ch2 && ch1 == ch3){
						dp[i][j][k] = dp[i + 1][j + 1][k + 1] + 1;
					}else{
						dp[i][j][k] = Math.max(dp[i + 1][j][k], Math.max(dp[i][j + 1][k], dp[i][j][k + 1]));
					}
				}
			}
		}
		return dp[0][0][0];
	}

}
