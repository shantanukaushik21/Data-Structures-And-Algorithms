package dp;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int MaxSum(int[] arr) {
		int[] dp=new int[100];
		if(arr[0]>=0) {
			dp[0]=arr[0];
		}else {
			dp[0]=0;
		}
		
		int maxSumSoFar=dp[0];
		int sum=dp[0];
		for(int i=1;i<arr.length;i++) {
			
		}
		
		return dp[arr.length-1];
	}

}
