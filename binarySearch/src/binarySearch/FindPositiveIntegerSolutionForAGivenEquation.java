package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindPositiveIntegerSolutionForAGivenEquation {
	//LeetCode 1237 Find Positive Integer Solution for a Given Equation
}

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> listOfAns= new ArrayList<>();
        for(int i=1;i<=1000;i++){
            List<Integer> ans=new ArrayList<>();
            int y=binarySearch(customfunction,z,i);
            if(y!=-1){
                ans.add(i);
                ans.add(y);
                listOfAns.add(ans);
            }
        }
        return listOfAns;
    }
    public int binarySearch(CustomFunction customfunction, int z, int x){
        int start=1;
        int end=1000;
        while(start<=end){
            int mid=(start+end)/2;
            if(customfunction.f(x,mid)==z){
                return mid;
            }else if(customfunction.f(x,mid)<z){
                start=start+1;
            }else{
                end=end-1;
            }
        }
        return -1;
    }
}
