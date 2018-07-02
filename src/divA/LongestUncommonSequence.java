package divA;

import java.util.Scanner;

public class LongestUncommonSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		if(s1.equals(s2)){
			System.out.println("-1");
		}else{
			System.out.println(Math.max(s1.length(), s2.length()));
		}

	}

}
