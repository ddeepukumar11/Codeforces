package divA;

import java.util.Scanner;

public class IsItRated {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		pair[] arr= new pair[n];
		for(int i = 0;i < n; i++){
			arr[i] = new pair(scn.nextInt(), scn.nextInt());
		}
		
		int counter = 0;
		for(int i = 0;i < n; i++){
			if(arr[i].before != arr[i].after){
				System.out.println("rated");
				return;
			}else{
				if(i < n - 1 && arr[i].before < arr[i + 1].before){
					counter++;
//					System.out.println("unrated");
					
				}
			}
		}
		
		if(counter > 0){
			System.out.println("unrated");
		}else
		System.out.println("maybe");
	}
	
	private static class pair{
		int before;
		int after;
		pair(int before, int after){
			this.before = before;
			this.after = after;
		}
	}
	
	

}
