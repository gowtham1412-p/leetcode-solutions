class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0||n<0){
            return false;
        }
        int ans=n/2;
        int n1=0,n2=1;
        while(n2<ans){
            int res=n1+n2;
            n1=n2;
            n2=res;
        }
        if(n2==ans){
            return true;
        }
        return false;
    }
}