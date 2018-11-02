package divA;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||
			   ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' 	){
				continue;
			}else{
				sb.append(".");
				if(ch >= 'a' && ch <= 'z'){
					sb.append(ch);
				}else{
					sb.append((char)(ch - 'A' + 'a'));
				}
			}
		}
		System.out.println(sb.toString());
	}

}
