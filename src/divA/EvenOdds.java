package divA;

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextInt();
		long x = scn.nextInt();
		System.out.println(solution(n, x));
	}

	private static long solution(long n, long x) {
		long odd = 0;
		if (n % 2 == 0)
			odd = n / 2;
		else
			odd = (n / 2) + 1;

		if (x <= odd) {
			return (2 * (x - 1)) + 1;
		} else {
			x -= odd;
			return 2 * x;
		}
	}

}
