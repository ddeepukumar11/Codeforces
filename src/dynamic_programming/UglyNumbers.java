package dynamic_programming;

public class UglyNumbers {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	
	public static int solution(int n){
		int[] dp = new int[n + 1];
		dp[1] = 1;
		int p2 = 1, p3 = 1, p5 = 1;
		for(int i = 1;i < n;i++){
			int min = Math.min(2 * dp[p2], Math.min(3 * dp[p3], 5 * dp[p5]));
			dp[i + 1] = min;
			if(2 * dp[p2]  == min){
				p2++;
			}if(3 * dp[p3]  == min){
				p3++;
			}if(5 * dp[p5]  == min){
				p5++;
			}
		}
		return dp[n];
	}

}
