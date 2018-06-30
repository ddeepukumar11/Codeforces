package divA;

import java.util.Scanner;

public class NewPassword {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		while(n > 0){
			for(int i = 0;i < k && n > 0;i++){
				System.out.print((char)('a' + i));
				n--;
			}
			
		}

	}

}
