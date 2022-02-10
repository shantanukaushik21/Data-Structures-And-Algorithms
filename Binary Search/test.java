package binarySearch;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] arr= {5,1,3,-1,-3,6};
		
//		Pair p=new Pair(3,4);
//		System.out.println(p.first);
		Pair[] pairArr=new Pair[arr.length];
		for(int i=0;i<arr.length;i++) {
			pairArr[i]=new Pair(arr[i],i);
		}
		
//		for(int i=0;i<pairArr.length;i++) {
//			System.out.println(pairArr[i].toString());
//		}
		//pair
		
	}

}
class Pair{
	int first;
	int second;
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	Pair(int first,int second){
		this.first=first;
		this.second=second;
	}
}
