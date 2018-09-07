package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class optimalBST {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] keys = new int[n];
		int[] freq = new int[n];
		for(int i = 0; i < n; i++){
			keys[i] = scn.nextInt();
			freq[i] = scn.nextInt();
		}

		System.out.println(solve(keys, freq));
	}
	
	private static class Pair implements Comparable<Pair> {
		int key;
		int freq;

		Pair(int key, int freq){
			this.key = key;
			this.freq = freq;
		}

		@Override
		public int compareTo(Pair o) {
			return this.key - o.key;
		}
	}

	private static int solve(int[] keys, int[] freq){
		Arrays.sort(keys);
		
		
		return 0;
	}

}
