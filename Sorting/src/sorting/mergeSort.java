package sorting;

import java.util.Arrays;




public class mergeSort{
	public static void merge(int[] arr, int l, int m, int r) {
		int lsize= m-l+1;
		int rsize=r-m;
		int[] L= new int[lsize];
		int[] R=new int[rsize];
		for(int i=0;i<lsize;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<rsize;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<lsize&&j<rsize) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<lsize) {
			arr[k]=L[i];
			k++;
			i++;
		}
		while(j<rsize) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	public static void sort(int[] arr, int l,int r) {
		if(l==r) {
			return;
		}
		int m=l+(r-l)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr, l, m, r);
	}
	public static void main(String[] args) {
		int[] arr1= {4,5,1,8,11,1,44,2,3,5};
		//int[] arr1= {0};
		int l=0;
		int r=arr1.length-1;
		sort(arr1,l,r);
		System.out.println(Arrays.toString(arr1));
	}
}











//public class mergeSort {
//	public static void merge(int[] arr, int l,int m,int r) {
//		int sl=m-l+1;
//		int sr=r-m;
//		int size=arr.length;
//		int[] L=new int[sl];
//		int[] R=new int[sr];
//		for(int i=0;i<sl;i++) {
//			L[i]=arr[i];
//		}
//		for(int i=0;i<sr;i++) {
//			R[i]=arr[m+1+i];
//		}
//		int i=0;
//		int j=0;
//		int k=l;
//		while(i<sl&&j<sr) {
//			if(L[i]<=R[j]) {
//				arr[k]=L[i];
//				i++;
//			}else {
//				arr[k]=R[j];
//				j++;
//			}
//			k++;                   
//		}
//		while(i<sl) {
//			arr[k]=L[i];
//			i++;
//			k++;
//		}
//		while(j<sr) {
//			arr[k]=R[j];
//			j++;
//			k++;
//		}
////		System.out.println(Arrays.toString(L));
////		System.out.println(Arrays.toString(R));
//	}
//	
//	public static void sort(int [] arr, int l,int r) {
//		if(l==r) {
//			return;
//		}
//			int m=l+(r-l)/2;
//			sort(arr, l,m);
//			sort(arr,m+1,r);
//			merge(arr,l,m,r);
//	}
//	public static void main(String[] args) {
//		int[] arr1= {4,5,1,8,11,1,44,2,3,5};
//		int l=0;
//		int r=arr1.length-1;
//		sort(arr1,l,r);
//		System.out.println(Arrays.toString(arr1));
////		System.out.println(m);
//		
//		
//	}
//}
