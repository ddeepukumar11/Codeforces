package divA;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0;i < n;i++){
			String str = scn.next();
			String ans = "";
			ans += (char)str.charAt(0);
			ans += (int)(str.length() - 2);
			ans += (char)str.charAt(str.length() - 1);
			
			if(str.length() <= 10){
				System.out.println(str);
			}else{
				System.out.println(ans);
			}
		}
	}

}
