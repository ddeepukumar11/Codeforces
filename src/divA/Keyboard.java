package divA;

import java.util.HashMap;
import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String f1 = "qwertyuiop";
		String f2 = "asdfghjkl;";
		String f3 = "zxcvbnm,./";
		HashMap<Character, Character> left = new HashMap<>();
		HashMap<Character, Character> right = new HashMap<>();
		for (int i = 0; i < f1.length(); i++) {
			if (i >= 1 && i < f1.length())
				right.put(f1.charAt(i), f1.charAt(i - 1));
			if (i < f1.length() - 1) {
				left.put(f1.charAt(i), f1.charAt(i + 1));
			}
		}
		for (int i = 0; i < f2.length(); i++) {
			if (i >= 1 && i < f2.length())
				right.put(f2.charAt(i), f2.charAt(i - 1));
			if (i < f2.length() - 1) {
				left.put(f2.charAt(i), f2.charAt(i + 1));
			}
		}
		for (int i = 0; i < f3.length(); i++) {
			if (i >= 1 && i < f3.length())
				right.put(f3.charAt(i), f3.charAt(i - 1));
			if (i < f3.length() - 1) {
				left.put(f3.charAt(i), f3.charAt(i + 1));
			}
		}
		char lorr = scn.next().charAt(0);
		String ques = scn.next();

		String ans = "";
		if (lorr == 'L') {
			for (int i = 0; i < ques.length(); i++) {
				ans += left.get(ques.charAt(i));
			}
		} else {
			for (int i = 0; i < ques.length(); i++) {
				ans += right.get(ques.charAt(i));
			}
		}
		System.out.println(ans);

	}

}
