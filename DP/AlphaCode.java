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
		
//		System.out.println(alphaCodeBottomUP(arr,arr.length));
	}
	public static int alphaCode(int[] arr, int n, int[] dp) {
		if(n==1) {
			dp[1]=1;
			return 1; 
		}
		if(n==0) {
			dp[0]=1;
			return 1;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int output=alphaCode(arr, n-1,dp);
		if((arr[n-2]*10+arr[n-1])<=26) {
			output+=alphaCode(arr, n-2,dp); 
		}
		dp[n]=output;
		return output;
	}
	
	public static int alphaCodeBottomUP(int[] arr, int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			int output=dp[i-1];
			if(arr[i-2]*10+arr[i-1]<=26) {
				output+=dp[i-2];
			}
			dp[i]=output;
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}
}
