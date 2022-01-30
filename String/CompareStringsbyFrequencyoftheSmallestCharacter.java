package String;

import java.util.Arrays;

public class CompareStringsbyFrequencyoftheSmallestCharacter {

//	1170. Compare Strings by Frequency of the Smallest Character
}

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] q= new int[queries.length];
        q=convertToInt(queries);
        int[] w=new int[words.length];
        w=convertToInt(words);
        Arrays.sort(w);
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=binarySearch(w,q[i]);
        }
        return ans;
    }
    public int freq(String str) {
		int count=1;
		char minChar=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(Character.compare(minChar,str.charAt(i))>0) {
				count=1;
				minChar=str.charAt(i);
			}else if(Character.compare(minChar,str.charAt(i))==0) {
				count++;
			}
		}
		return count;
	}
    public int[] convertToInt(String[] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=freq(arr[i]);
        }
        return ans;
    }
    public int binarySearch(int[] arr, int num){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==num){
                ans=Math.max(ans,mid);
                start=mid+1;
            }else if(arr[mid]>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(ans==-1) {
            end++;
            return arr.length-end;
		}
		return arr.length-ans-1;
    }
}