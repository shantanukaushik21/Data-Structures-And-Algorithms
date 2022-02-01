package dp;

import java.util.Arrays;

public class wineProblem {
	public static void main(String[] args) {
		int[] arr= {4,1,2,5,3};
		int len=arr.length;
		int[][] dp=new int[len+1][len+1];
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<=arr.length;j++) {
				dp[i][j]=-1;
			}
		}
//		for(int i=0;i<=arr.length;i++) {
//			for(int j=0;j<=arr.length;j++) {
//				System.out.print(dp[i][i]);
//			}
//			System.out.println();
//		}
		
		System.out.println(maxProfit(arr,0, arr.length-1,1,dp));
//		System.out.println(Arrays.toString(dp));
	}
	public static int maxProfit(int[] arr, int start, int end, int year, int[][] dp) {
		if(start>end) {
			return 0;
		}

		if(dp[start][end]!=-1) {
			return dp[start][end];
		}
		
		int first = arr[start]*year + maxProfit(arr, start+1,end,year+1,dp);
		int second = arr[end]*year + maxProfit(arr, start, end-1,year+1,dp);
		return Math.max(first,second);
	}
}
