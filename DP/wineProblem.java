package dp;

import java.util.Arrays;

public class wineProblem {
	public static void main(String[] args) {
		int[] arr= {4,1,2,5,3};
		
		int[] dp=new int[arr.length+1];
//		dp[0]=0;
		for(int i=0;i<arr.length+1;i++) {
			dp[i]=-1;
		}
		System.out.println(maxProfit(arr,0, arr.length-1,1));
		System.out.println(Arrays.toString(dp));
	}
	public static int maxProfit(int[] arr, int start, int end, int year) {
		if(start>end) {
			return 0;
		}
		if(year>arr.length) {
			return 0;
		}

		int first = arr[start]*year + maxProfit(arr, start+1,end,year+1);
		int second = arr[end]*year + maxProfit(arr, start, end-1,year+1);
		return Math.max(first,second);
	}
}
