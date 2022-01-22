package dp;

import java.util.Arrays;

public class coinChange {
	
	public static int coinChange(int amount, int[] coins,int n,int[][] output) {
		if(amount==0) {
			output[n][amount]=1;
			return 1;
		}
		if(amount<0) {
			return 0;
		}
		if(n<0 &&amount>=1) {
			return 0;
		}
		if(output[n][amount]!=-1) {
			return output[n][amount];
		}
		output[n][amount]=coinChange(amount,coins,n-1,output)+coinChange(amount-coins[n], coins,n,output) ;
		return output[n][amount];
//		return coinChange(amount,coins,n-1,output)+coinChange(amount-coins[n], coins,n,output) ;
		
	}
	public static void main(String[] args) {
		int[] coins= {1,2,5};
		int amount=5;
		int[][] output=new int[coins.length][amount+1];
		for(int i=0;i<coins.length;i++) {
			for(int j=0;j<=amount;j++) {
				output[i][j]=-1;
			}
		}
		
		System.out.println(coinChange(amount, coins, coins.length-1, output));
		
		for(int i=0;i<=coins.length;i++) {
			for(int j=0;j<=amount;j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}
}
