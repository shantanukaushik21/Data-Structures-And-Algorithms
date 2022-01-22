package dp;

public class coinChange {
	
	public static int coinChange(int amount, int[] coins, int i) {
		if(amount==0) {
			return 1;
		}
		if(amount<0) {
			return 0;
		}
		
		if(i==coins.length) {
			return 0;
		}
		int first=coinChange(amount-coins[i],coins, i);
		int second=coinChange(amount, coins, i++);
		return first+second;
	}
	public static void main(String[] args) {
		int[] coins= {1,2,5};
		int amount=5;
		System.out.println(coinChange(amount, coins, 0));
	}
}
