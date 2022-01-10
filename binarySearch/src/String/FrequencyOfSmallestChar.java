package String;

public class FrequencyOfSmallestChar {
	public static int freq(String str) {
		int count=1;
		char minChar=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(Character.compare(minChar,str.charAt(i))>0) {
				count=1;
				minChar=str.charAt(i);
			}else if(Character.compare(minChar,str.charAt(i))==0) {
				count++;
			}
		}
		System.out.println(minChar);
		return count;
	}
	public static void main(String[] args) {
//		System.out.println(freq("fadcaazaffhk"));
		System.out.println(freq("fwedfgengneinaaadkwnfkw"));
	}
}
