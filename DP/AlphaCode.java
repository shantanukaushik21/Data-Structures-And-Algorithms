package dp;

public class AlphaCode {

	public static void main(String[] args) {
		int[] arr= {1,1,2,5};
		System.out.println(alphaCode(arr,arr.length));
	}
	public static int alphaCode(int[] arr, int n) {
		if(n==1) {
			return 1; 
		}
		if(n==0) {
			return 0;
		}
		int output=alphaCode(arr, n-1);
		if((arr[n-2]*10+arr[n-1])<=24) {
			output+=alphaCode(arr, n-2); 
		}
		return output;
	}
}
