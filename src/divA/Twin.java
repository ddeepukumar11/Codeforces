package divA;

import java.util.Arrays;
import java.util.Scanner;

public class Twin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int coins = scn.nextInt();
		int[] arr = new int[coins];
		int total = 0;
		for(int i = 0;i < arr.length;i++){
			arr[i] = scn.nextInt();
			total += arr[i];
		}
		Arrays.sort(arr);
		int count = 0;
		int sum2 = 0;
		for(int i = arr.length - 1;i >= 0;i--){
			sum2 += arr[i];
			count++;
			if(total < 2 * sum2){
				break;
			}
		}
		System.out.println(count);

	}

}
