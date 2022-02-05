package dp;

import java.util.Arrays;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,2,-2,1,-1,-100,4};
//		System.out.println(MaxSum(arr));
		System.out.println(MaxSumSO(arr));

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
	
	//Space Optimized
	
	public static int MaxSumSO(int[] arr) {
		
		//BaseCase: when all the element on the array is negative this function would give 0
		//to fix that we need to consider this case separately;
		boolean flag=false;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
			if(arr[i]>=0) {
				flag=true;
			}
		}
		if(!flag) {
			return max;
		}
		
		
		
		
		int currSum=0;
		int MaxSumSoFar=0;
		
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			MaxSumSoFar=Math.max(MaxSumSoFar, currSum);
			if(currSum<0) {
				currSum=0;
			}
		}
		
		
		return MaxSumSoFar;
	}

}
