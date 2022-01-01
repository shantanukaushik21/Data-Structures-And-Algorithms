import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr= {4,6,7,2,4,5,5,7,9,10};
		int[] ans=removeDUplicates(arr);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	
	public static int[] removeDUplicates(int[] arr){
		List<Integer> answer=new ArrayList<>();
		
		Map<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], true);
				answer.add(arr[i]);
			}
		}
		//System.out.println(answer.toString());
		int[] ansInArray=new int[answer.size()];
		for(int i=0;i<answer.size();i++) {
			ansInArray[i]=answer.get(i);
		}
		return ansInArray;
	}
}
