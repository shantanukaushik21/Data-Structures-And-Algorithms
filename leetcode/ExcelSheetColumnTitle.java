
public class ExcelSheetColumnTitle {
//	168. Excel Sheet Column Title
}

class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String ans="";
        while(n>=1){
            int rem=n%26;
            if(rem==0){
                ans="Z"+ans;
                n=n/26 -1;
            }else{                
                ans= ((char)(rem+64))+ans;
                n=n/26;
            }
            
        }
        return ans;
    }
}