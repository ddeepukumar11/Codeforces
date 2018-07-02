package divA;

import java.util.Scanner;

public class Bitplus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = 0;
		while(n-- > 0){
			String str = scn.next();
			if(str.charAt(1) == '+'){
				x++;
			}else{
				x--;
			}
		}
		System.out.println(x);

	}

}
