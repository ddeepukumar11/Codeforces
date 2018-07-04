package divA;


import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int length = scn.nextInt();
		String str = scn.next();
		HashSet<Character> map = new HashSet<>();
		for(int i = 0;i < length;i++){
			char ch = str.charAt(i);
			map.add(Character.toLowerCase(ch));
			
		}
		if(map.size() == 26){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
