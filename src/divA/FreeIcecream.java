package divA;

import java.util.Scanner;

public class FreeIcecream {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		long start = scn.nextLong();
		int dukhi = 0;
		while(t-- > 0){
			char ch = scn.next().charAt(0);
			int num = scn.nextInt();
			
			if(ch == '-'){
				if(start - num >= 0){
					start -= num;
				}else{
					dukhi++;
				}
			}else{
				start += num;
			}
			
		}
		System.out.print(start + " " + dukhi);

	}

}
