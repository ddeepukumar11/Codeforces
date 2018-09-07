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
		long evenorodd = 0;
		if (n % 2 == 0)
			evenorodd = n / 2;
		else
			evenorodd = (n / 2) + 1;

		if (x <= evenorodd) {
			return (2 * (x - 1)) + 1;
		} else {
			x -= evenorodd;
			return 2 * x;
		}
	}

}
