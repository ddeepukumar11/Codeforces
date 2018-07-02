package divA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SnackTower {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int size = n;
		HashSet<Integer> map = new HashSet<>();
		for(int i = 1;i <= n;i++){
			int num = scn.nextInt();
			if(num != size){
				System.out.println();
				map.add(num);
			}else{
				System.out.print(num + " ");
				size--;
				while(size > 0 && map.contains(size)){
					System.out.print(size + " ");
					size--;
				}
				System.out.println();
			}
		}

	}

}
