package divA;

import java.util.Scanner;

public class LineLandMail {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length;i++){
			arr[i] = scn.nextInt();
		}
		for(int i = 0;i < arr.length;i++){
			if(i == 0){
				System.out.print(arr[1] - arr[0] + " ");
			}
			else if(i == arr.length - 1){
				System.out.print(arr[arr.length - 1] - arr[arr.length - 2] + " ");
			}else{
				System.out.print(Math.min(arr[i] - arr[i - 1], arr[i + 1] - arr[i]) + " ");
			}
			System.out.println(Math.max(arr[i] - arr[0], arr[arr.length - 1] - arr[i]));
		}

	}

}
