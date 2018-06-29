package divA;

import java.util.Scanner;

public class CarrotCakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();
		int k = scn.nextInt();
		int d = scn.nextInt();
		int factor = t * ((int)Math.ceil((double)n / k) - 1);
		if(d < factor){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
