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
		
//		System.out.println(maxProfit(arr,0, arr.length-1,1,dp));
		
		System.out.println(bottomUp(arr));
		
		
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
	
	public static int bottomUp(int[] arr) {
		
		int n= arr.length;
		int dp[][]=new int[n][n];
		int year=n;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>j) {
					dp[i][j]=0;
				}
				if(i==j) {
					dp[i][j]=year*arr[i];
				}
			}
		}
		year--;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(dp[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		int jindex=1;
		
		while(jindex<n) {
			int i=0; int j=jindex;
			while(i<year) {
				dp[i][j]=Math.max(year*arr[i]+dp[i+1][j], year*arr[j]+dp[i][j-1]);
				j++;
				i++;
				if(j==n) {
					break;
				}
			}
			year--;
			jindex++;
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<n;k++) {
				System.out.print(dp[i][k]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		return dp[0][n-1];
	}
}
