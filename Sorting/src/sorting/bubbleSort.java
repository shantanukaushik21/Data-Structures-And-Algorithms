package sorting;

public class bubbleSort {
	public static int[] bubbleSort(int[] arr) {
		boolean swap=true;
		int temp=-1;
		while(swap) {
			int noOfSwaps=0;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					noOfSwaps++;
				}
				
			}
			if(noOfSwaps==0) {
				swap=false;
			}
		}
		
		return arr;
	}

}
