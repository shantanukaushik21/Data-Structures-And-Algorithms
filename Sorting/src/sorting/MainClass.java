package sorting;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[] arr= {5,5,62,7,9,-1,-55,-10000,2,10000};
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {0,0,1,2,8,5,3,-12,3};
		int[] arr3= {};
		insertionSort sort=new insertionSort();
//		sort.sort(arr, arr.length-1);
//		sort.sort(arr1,arr1.length-1);
//		sort.sort(arr2,arr2.length-1);
//		sort.sort(arr3,arr3.length-1);
		sort.sort(arr);
		sort.sort(arr1);
		sort.sort(arr2);
		sort.sort(arr3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));


	}

}
