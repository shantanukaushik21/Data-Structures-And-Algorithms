package binarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lowerBound {
	public static void main(String[] args) {
		int[] arr= {4,2,1,2,3,4,5,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(LB(arr,2));
	}
	public static int LB(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int mid=(start+end)/2;
		int ans=-1;
		while(start<=end) {
			if(nums[mid]==target) {
				ans=nums[mid];
				break;
			}
			if(nums[mid]>target) {
				end=mid-1;
			}
			if(nums[mid]<target) {
				start=mid+1;
			}
		}
		return ans;
	}
}

