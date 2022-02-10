import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,54,7,89,1};
//		RA1(arr);
		RA2(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	//iterative approach
	public static void RA1(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
	}
	
	//Recursive approach
	
	public static void RA2(int[] arr, int start, int end) {
		if(start>end) {
			return;
		}
		if(arr.length==0) {
			return;
		}
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		RA2(arr, start+1,end-1);
	}
}



