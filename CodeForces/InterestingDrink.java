package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] shops =new int[n];
		for(int i=0;i<n;i++) {
			shops[i]=sc.nextInt();
		}
		Arrays.sort(shops);;
		int q=sc.nextInt();
		int[] coins=new int[q];
		for(int i=0;i<q;i++) {
			coins[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++) {
			int ans=binarySearch(shops,coins[i]);
			if(ans==-1) {
				System.out.println(0);
			}else {
				System.out.println(ans+1);
			}
		}
		
		
		
//		int[] shops = {3,10,8,6,11,6,6};
//		Arrays.sort(shops);
//		System.out.println(Arrays.toString(shops));
//		System.out.println(binarySearch(shops,2));
		
		

	}
	
	public static int binarySearch(int[] arr, int n) {
		int start=0;
		int end=arr.length-1;
		int ans=Integer.MIN_VALUE;
		boolean flag=false;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==n) {
				ans=Math.max(ans, mid);
				start=mid+1;
				flag=true;
			}else if(arr[mid]>n) {
				end=mid-1;
			}else if(arr[mid]<n) {
				start=mid+1;
			}
		}
		if(!flag) {
			return end;
		}
		return ans;
		
	}

}
