package divA;

import java.util.HashMap;
import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1;i <= n;i++){
			map.put(scn.nextInt(), i);
		}
		for(int i = 1;i <= n;i++){
			System.out.print(map.remove(i) + " ");
		}
	}

}
