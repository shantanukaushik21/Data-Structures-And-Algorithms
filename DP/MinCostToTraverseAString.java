package dp;

import java.util.Arrays;
import java.util.HashMap;

public class MinCostToTraverseAString {
	
	public static void main(String[] args) {
		String str= "abceded";
//		String str= "abcadedesdqzd";
		HashMap<Character,Integer> map=new HashMap<>();
		int[] dp =new int [str.length()];
		dp[0]=0;
		map.put(str.charAt(0), 0);
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			if(map.containsKey(curr)) {
				dp[i]=Math.min(map.get(curr),dp[i-1]+ Math.abs(toInt(curr)-toInt(str.charAt(i-1))));
				if(dp[i]<map.get(curr)) {
					map.put(curr, dp[i]);
				}
			}else {
				dp[i]=dp[i-1]+ Math.abs(toInt(curr)-toInt(str.charAt(i-1)));
				map.put(curr, dp[i]);
			}
		}
		System.out.println(dp[str.length()-1]);

		System.out.println(Arrays.toString(dp));
	}
	
	
	public static int toInt(char ch) {
		int ans= ch;
		return ch;
		
	}
}
