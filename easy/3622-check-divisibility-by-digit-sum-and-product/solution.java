class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int n1=n;
        int pro=1;
        while(n1>0){
            int digit=n1%10;
            sum+=digit;
            pro*=digit;
            n1/=10;
        }
        
 
        return n%(sum+pro)==0;
    }
}