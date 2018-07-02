package divA;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int count = 0;
		int tar = 0;
		for (int i = 1; i <= n; i++) {
			int num = scn.nextInt();
			if (i <= k && num != 0) {
				if (i == k) {
					tar = num;
				}
				count++;
			} else if (i > k && num != 0 && num >= tar) {
				count++;
			}
		}
		System.out.println(count);

	}

}
