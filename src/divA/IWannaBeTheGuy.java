package divA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 HashSet<Integer> map = new HashSet<>();
		 int p = scn.nextInt();
		 for(int i = 0; i < p; i++){
			 map.add(scn.nextInt());
		 }
		 int q = scn.nextInt();
		 for(int i = 0; i < q; i++){
			 map.add(scn.nextInt());
		 }
		 int counter = 0;
		 for(int i = 0;i < n;i++){
			 if(!map.contains(i + 1)){
				 counter++;
			 }
		 }
		 if(counter > 0){
			 System.out.println("Oh, my keyboard!");
		 }else{
			 System.out.println("I become the guy.");
		 }
	}

}
