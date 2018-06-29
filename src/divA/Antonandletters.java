package divA;

import java.util.HashSet;
import java.util.Scanner;

public class Antonandletters {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		HashSet<Character> set = new HashSet<>();
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				set.add(ch);
			}
		}
		System.out.println(set.size());
	}

}
