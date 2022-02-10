package binarySearch;

import java.util.Arrays;

public class KWeakestRowsInAMatrix {
// leetCode 1337 K Weakest Rows In A Matrix
}

//copy and paste below this line in leet code to run
//also change the name of the class Solution1337 to Solution 

class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        pair[] arr=new pair[mat.length];
        for(int i=0;i<mat.length;i++){
            // arr[i]=numberOfSoldiers(mat[i]);
            arr[i]=new pair(i,numberOfSoldiers(mat[i]));
        }
        
        Arrays.sort(arr);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i].getRow();
        }
        return ans;
        
    }
    public int numberOfSoldiers(int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        boolean flag=false;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==0){
                flag=true;
                ans=Math.min(ans, mid);
                end=mid-1;
            }else if(arr[mid]==1){
                start=mid+1;
            }
        }
        if(!flag){
            return arr.length;
        }
        return ans;
    }
}
class pair implements Comparable<pair>{
    int row;
    int noOfSoldiers;
    
    public int getRow(){
        return this.row;
    }
    public pair(int row, int noOfSoldiers){
        this.row=row;
        this.noOfSoldiers=noOfSoldiers;
    }
    public int compareTo(pair p){
        if(this.noOfSoldiers!=p.noOfSoldiers){
            return this.noOfSoldiers-p.noOfSoldiers;
        }
        return this.row-p.row;
    }
    
}
