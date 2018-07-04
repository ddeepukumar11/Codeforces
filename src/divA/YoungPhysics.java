package divA;

import java.util.Scanner;

public class YoungPhysics {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = 0,y = 0, z = 0;
		for(int i = 1;i <= n;i++){
			x += scn.nextInt();
			y += scn.nextInt();
			z += scn.nextInt();
		}
		if(x == 0 && y == 0 && z == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
