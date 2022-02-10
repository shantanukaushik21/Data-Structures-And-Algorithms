package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArrays {

//	leetcode 349. Intersection of Two Array
//........
//........
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i], false);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(!map.get(nums2[i])){
                    list.add(nums2[i]);
                    map.put(nums2[i],true);
                }
            }
        }
        int [] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
