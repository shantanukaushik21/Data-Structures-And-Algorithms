package sorting;

public class insertionSort {
	public static void sort(int[] arr) {
		
		int counter=1;
		for(int i=1;i<arr.length;i++) {
			int pick=arr[i];
			int left=counter-1;
			int right=i;
			
			while(arr[right]<arr[left]&&left>=0) {
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
				left--;
				right--;
			}
			counter++;
			
		}
	}
}
