package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class SuperUglyNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] primes = new int[n];
		for (int i = 0; i < n; i++) {
			primes[i] = scn.nextInt();
		}
		int nth = scn.nextInt();
		System.out.println(solution(primes, nth));

	}

	private static int solution(int[] primes, int nth) {
		int[] pointers = new int[primes.length];
		Arrays.fill(pointers, 1);
		int[] dp = new int[nth + 1];
		dp[1] = 1;
		for (int i = 1; i < nth; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < primes.length; j++) {
				if (primes[j] * dp[pointers[j]] < min) {
					min = primes[j] * dp[pointers[j]];
				}
			}
			dp[i + 1] = min;
			for (int j = 0; j < primes.length; j++) {
				if (primes[j] * dp[pointers[j]] == min) {
					pointers[j]++;
				}
			}
		}

		return dp[nth];
	}

}
