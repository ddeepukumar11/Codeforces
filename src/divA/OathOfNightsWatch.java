package divA;

import java.util.Scanner;

public class OathOfNightsWatch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i < n ;i++){
			arr[i] = scn.nextInt();
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
	
		}
		int count = 0;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] > min && arr[i] < max){
				count++;
			}
		}
		System.out.println(count);

	}

}
