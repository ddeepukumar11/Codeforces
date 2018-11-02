package gfgarrays;

public class Reversalalgo {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		reversal(arr, 2, 7);
	}

	public static void reversal(int[] arr, int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
		
		for(int i = 0; i< n;i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverse(int[] arr, int si, int ei) {
		while(si < ei){
			int temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
	}

}
