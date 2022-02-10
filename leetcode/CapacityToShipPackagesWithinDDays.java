package binarySearch;

public class CapacityToShipPackagesWithinDDays {
//	1011. Capacity To Ship Packages Within D Days
// Not my best solution 
// will have to thing of a better approach to reduce the number of conditions
	
	
	class Solution {
	    public int shipWithinDays(int[] weights, int days) {
	        int start=0;
	        int end=25000000;
	        int ans=Integer.MAX_VALUE;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(isPossible(weights, days, mid)){
	                ans=Math.min(ans,mid);
	                end=mid-1;
	            }else{
	                start=mid+1;
	            }
	        }
	        return ans;
	    }
		public boolean isPossible(int[] weights, int days, int minLoad){
	        int load=0;
	        int dayscount=1;
	        int start=0;
	        if(days==1){
	            int sum=0;
	            for(int i=0;i<weights.length;i++){
	                sum+=weights[i];
	            }
	            if(minLoad==sum){
	                return true;
	            }
	        }
	        while(start<weights.length){
	            if(weights[start]>minLoad){
	                return false;
	            }
	            load=load+weights[start];
	            if(load>minLoad){
	                dayscount++;
	                load=weights[start];
	            }else if(load==minLoad){
	                if(start!=weights.length-1){
	                    dayscount++;
	                    load=0;
	                }
	                
	            }
	            start++;
	            // if(start==weights.length-1&&load!=0) {
	            // 	dayscount++;
	            // }
	            if(dayscount>days){
	                return false;
	            }
	        }

	        return true;
	    }
	}
}

