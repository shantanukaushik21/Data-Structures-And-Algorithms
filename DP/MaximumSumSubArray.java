package dp;

import java.util.Arrays;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,2,-2,1,-1,-100,4};
		System.out.println(MaxSum(arr));

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
			dp[i]=dp[i-1]+arr[i];
			if(dp[i]<0) {
				dp[i]=0;
			}
			maxSumSoFar=Math.max(maxSumSoFar, dp[i]);
			
		}
		System.out.println(Arrays.toString(dp));
		return maxSumSoFar;
	}

}
