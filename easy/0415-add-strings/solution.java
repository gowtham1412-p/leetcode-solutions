class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();     
        int res[]=new int[m+n];
        int k=res.length-1;
        int i=m-1;
        int j=n-1;
        int carry=0;
        while(i>=0||j>=0||carry>0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1=num1.charAt(i)-'0';
            }
            if(j>=0){
                n2=num2.charAt(j)-'0';
            }
            int sum=n1+n2+carry;
            res[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        String ans="";
        for(int dig:res){
            if(ans.equals("")&&dig==0){
                continue;
            }
            ans+=dig;
        }
        return ans.equals("") ? "0" :ans;
    }
}