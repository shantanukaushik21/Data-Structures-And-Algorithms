package devideAndConquer;

public class medainOfTwoSortedArrays {
	
	public static void main(String[] args) {
		int arr1[] = {1, 12, 15, 26, 38};
        int arr2[] = {2, 13, 17, 30, 45};
        System.out.println(median(arr1,arr2,arr1.length));
	}
	
	public static int median(int[] arr1, int[] arr2, int n) {
		int[] arr=new int[2*n];
		int end=0;
//		int n1=arr1.length;
//		int n2=arr2.length;
		int i=0;
		int j=0;
		while(i<n&&j<n) {
			if(arr1[i]<=arr2[j]) {
				arr[end]=arr1[i];
				i++;
			}else {
				arr[end]=arr2[j];
				j++;
			}
			end++;
		}
		while(i<n) {
			arr[end]=arr1[i];
			i++;
			end++;
		}
		while(i<n) {
			arr[end]=arr2[j];
			j++;
			end++;
		}
		return (arr[n]+arr[n-1])/2;
	}
}

