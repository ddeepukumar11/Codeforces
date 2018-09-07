package divA;

import java.util.Scanner;

public class OlesyaAndRodion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();
		if (t == 10) {
			if (n == 1) {
				System.out.println("-1");
			} else {
				System.out.print(1);
				for (int i = 1; i < n; i++) {
					System.out.print("0");
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				System.out.print(t);
			}
		}
	}

}
