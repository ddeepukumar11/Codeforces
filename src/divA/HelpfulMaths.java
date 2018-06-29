package divA;

import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[3];

		String str = scn.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '1') {
				arr[0] += 1;
			} else if (ch == '2') {
				arr[1] += 1;
			} else {
				arr[2] += 1;
			}
		}
		int length = str.length();
		for (int i = 1; i <= str.length();) {
			if (i % 2 == 0) {
				System.out.print("+");
				i++;
			} else {
				if (arr[0] != 0) {

					System.out.print("1");
					arr[0]--;
					i++;
				} else if (arr[1] != 0) {
					System.out.print("2");
					arr[1]--;
					i++;
				} else {
					System.out.print("3");
					arr[2]--;
					i++;
				}
			}
		}

	}

}
