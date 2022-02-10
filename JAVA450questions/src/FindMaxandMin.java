
public class FindMaxandMin {
	
	public static void main(String[] args) {
		int[] arr= {4,1,2,5,7,8,44,0,7,100,7};
		Pair ans=find(arr);
		System.out.println("max= "+ans.getMax());
		System.out.println("min= "+ans.getMin());
	}
	
	public static Pair find(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		Pair p=new Pair(max, min);
		return p;
	}
}

class Pair{
	int max;
	int min;
	Pair(int max, int min){
		this.max=max;
		this.min=min;
	}
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
	
}
