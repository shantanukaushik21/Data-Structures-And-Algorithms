package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class perfectNumberCodeForces {
	// Problem 919B codeforces
    
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int[] dp=new int[10001];
		dp[0]=0;
		int index=1;
		int i=0;
		while(index<=n) {
			if(perfectNumber(i)) {
				index++;
			}
			i++;

		}
		System.out.println(--i);
		

	}
	public static boolean perfectNumber(int n) {
		int sum=0;
		while(n>0){
			int digit=n%10;
			sum+=digit;
			n=n/10;
		}
		if(sum==10) {
			return true;
		}else {
			return false;
		}
	}
}
