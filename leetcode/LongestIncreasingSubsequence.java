package leetcode;

public class LongestIncreasingSubsequence {
//	300. Longest Increasing Subsequence
}

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int[] lisArr=new int[nums.length];
        lisArr[0]=1;
        int max=-1;
        int best=-1;
        for(int i=1;i<nums.length;i++){
            int possAns=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    possAns=Math.max(possAns,lisArr[j]+1);
                }
            }
            lisArr[i]=possAns;
            best=Math.max(best,possAns);
        }
        // System.out.println(Arrays.toString(lisArr));
        return best;
    }
}