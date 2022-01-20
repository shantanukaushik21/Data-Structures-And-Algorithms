package dp;

import java.util.Arrays;

public class AlphaCode {

	public static void main(String[] args) {
		int[] arr= {1,1,2,5};
		int[] dp=new int[arr.length+1];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		System.out.println(alphaCode(arr,arr.length,dp));
		System.out.println(Arrays.toString(dp));
	}
	public static int alphaCode(int[] arr, int n, int[] dp) {
		if(n==1) {
			dp[1]=1;
			return 1; 
		}
		if(n==0) {
			dp[0]=0;
			return 0;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int output=alphaCode(arr, n-1,dp);
		if((arr[n-2]*10+arr[n-1])<=24) {
			output+=alphaCode(arr, n-2,dp); 
		}
		dp[n]=output;
		return output;
	}
}
