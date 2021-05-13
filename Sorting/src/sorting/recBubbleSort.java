package sorting;

public class recBubbleSort {
	public static void sort(int[] arr,int end) {
		if(arr.length==0) {
			return;
			//added this only to deal with empty array test case, can eliminate this my using array size instead of the end.
		}
		
		if(end==0) {
			return;
			//Base Case
		}
		
		for(int i=0;i<end;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		sort(arr,end-1);
	}
}
// here I have taken end as the index of the last element of the arr.
//but it would be better if you would have taken size of the array.