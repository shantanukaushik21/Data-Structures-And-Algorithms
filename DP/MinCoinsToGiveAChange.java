package dp;

import java.util.Arrays;

public class MinCoinsToGiveAChange {
	public static void main(String[] args) {
//		int coins[]= {1,2,5};
//		int change=5;
		int coins[]= {1,4,5,7,10};
		int change=19;
//		System.out.println(change1(change,coins));
		System.out.println(change2(change,coins));
	}
	public static int change1(int change, int[] coins) {
		//bottom up approach
		int[] ans=new int[change+1];
		ans[0]=0;
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=change;i++) {
			min=Integer.MAX_VALUE;
			for(int j=0;j<coins.length;j++) {
				if(i-coins[j]>=0) {
					min=Math.min(min, ans[i-coins[j]]+1);
				}
			}
			ans[i]=min;
		}
		System.out.println(Arrays.toString(ans));
		return ans[change];
	}
	
	public static int change2(int change, int[] coins) {
		if(change==0) {
			return 0;
		}
		if(change<0) {
			return Integer.MAX_VALUE;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++) {
			if(change>=coins[i]) {
				min=Math.min(min, change2(change-coins[i], coins));
			}
		}
		return min+1;
	}
}
