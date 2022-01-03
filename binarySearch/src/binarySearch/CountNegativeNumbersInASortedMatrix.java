package binarySearch;

public class CountNegativeNumbersInASortedMatrix {
	// LeetCode question number 1351
}

//Solution

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            count=count +countNegative(grid[i]);
        }
        return count;
    }
    public int countNegative(int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        boolean flag=false;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<0){
                flag=true;
                ans=Math.min(ans,mid);
                end=mid-1;
            }else if(arr[mid]>=0){
                start=mid+1;
            }
        }
        if(!flag){
            return 0;
        }
        return arr.length-ans;
    }
}
