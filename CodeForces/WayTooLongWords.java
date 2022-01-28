package CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] input=new String[n];
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			input[i]=convert(str);
//			System.out.println(str.length());

		}
		
		for(int i=0;i<n;i++) {
			System.out.println(input[i]);

		}

		
	}
	public static String convert(String word) {
		String ans="";
		if(word.length()>10) {
			ans=word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
			return ans;
		}
		return word;
	}
}
