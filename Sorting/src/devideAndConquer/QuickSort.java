import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= {3,4,2,7,8};
		sort(arr,0,4);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void sort(int[] arr, int start, int end) {
		if(start<end) {
			int p=partition(arr, start, end);
			sort(arr, start, p-1);
			sort(arr, p+1, end);
		}
	}
	public static int partition(int[] arr, int start, int end) {
		
		int pivot=arr[end];
		int i=start-1;
		int j=start;
		for(j=start;j<=end-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
		return i+1;
	}
	public static void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
