package divA;

import java.util.Scanner;

public class Juicer {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int oranges = scn.nextInt();
		int size = scn.nextInt();
		int cap = scn.nextInt();
		int[] arr = new int[oranges];
		for (int i = 0; i < oranges; i++) {
			arr[i] = scn.nextInt();
		}
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= size) {
				sum += arr[i];
				if(sum > cap){
					sum = 0;
					count++;
				}
			}
			
		}
		if(sum > cap){
			sum = 0;
			count++;
		}
		System.out.println(count);

	}

}
