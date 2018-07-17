package dynamic_programming;

import java.util.Scanner;

public class MinJumps {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		Integer[] dp = new Integer[arr.length];
		dp[dp.length - 1] = 0;
		dp[dp.length - 2] = 1;
		for (int i = dp.length - 3; i >= 0; i--) {
			if(arr[i] == 0){
				dp[i] = Integer.MAX_VALUE;
				continue;
			}
			int yahasejump = arr[i];
			int minjumps = Integer.MAX_VALUE;
			for(int j = 1;j <= yahasejump;j++){
				if(i + j < dp.length && dp[i + j] < minjumps){
					minjumps = dp[i + j] + 1;
				}
			}
			dp[i] = minjumps;
		}
		return dp[0];
	}

}
