package devideAndConquer;

import java.util.Arrays;

public class inversionCount {
	public static int merge(int[] arr,int l, int m, int r) {
		int count=0;
		int n1=m-l+1;
		int n2=r-m;
		int mid=n1-1;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				
				count=count+mid-i+1;
				System.out.println("m= "+m+" i= "+i+" j= "+j);
				System.out.println("L ="+Arrays.toString(L));
				System.out.println("R ="+Arrays.toString(R));
				
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		return count;
	}
	public static int inCount(int[] arr, int l, int r) {
		if(l>=r) {
			return 0;
		}
		int m= l+(r-l)/2;
		return inCount(arr, l,m)+inCount(arr,m+1,r)+merge(arr,l,m,r);
	}
	public static void main(String[] args) {
		int[] arr= {0,1,3,2};
		System.out.println(inCount(arr,0,arr.length-1));
		System.out.println(Arrays.toString(arr));
	}
}
