package String;

public class BinaryToInt {
	public static void main(String[] args) {
		String str=("1111");
		System.out.println(ConvertToInt(str));
	}
	public static int ConvertToInt(String str) {
		if(str.length()==0) return -1;
		int ans=0;
		int curr=1;
		for(int i=str.length()-1;i>=0;i--) {
			if(i==str.length()-1) {
				if(str.charAt(i)=='1') {
					ans+=1;
				}
				continue;
			}
			if(str.charAt(i)=='1') {
				curr*=2;
				ans+=curr;
			}else {
				curr*=2;
			}
		}
		return ans;
	}
}
