package binarySearch;
import java.util.Arrays;

public class lowerBound {
	public static void main(String[] args) {
		int[] arr= {4,2,1,2,31,2,1,1,1,1,1,4,5,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(LB(arr,2));
		System.out.println(UB(arr,2));
	}
	public static int LB(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int ans=Integer.MAX_VALUE;
		boolean flag=false;
		while(start<=end) {
			int mid=(start+end)/2;
			System.out.println("Vlue of mid = "+mid);
			if(nums[mid]==target) {
				flag=true;
				ans=Math.min(ans, mid);
				end=mid-1;
			}
			else if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
		}
		if(!flag) {
			return -1;
		}
		return ans;
	}
	
	public static int UB(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int ans=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]==target) {
				ans=Math.max(ans, mid);
				start=mid+1;
			}else if(nums[mid]>target) {
				end=mid-1;
			}else if(nums[mid]<target) {
				start=mid+1;
			}
		}
		return ans;
	}
}

