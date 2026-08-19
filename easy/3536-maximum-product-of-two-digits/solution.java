class Solution {
    public int maxProduct(int n) {
        int sum1=-1,sum2=-1;
        while(n!=0){
            int digit=n%10;
            if(sum1<digit){
                sum2=sum1;
                sum1=digit;
            }else if(sum2<digit){
                sum2=digit;
            }
            n/=10;
        }
        return sum1*sum2;
    }
}