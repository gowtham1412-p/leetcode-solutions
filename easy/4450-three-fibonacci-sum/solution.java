class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0 ||n<0){
            return false;
        }
        int tar=n/2;
        int i=0;
        int j=1;
        while(j<tar){
            int fur=i+j;
            i=j;
            j=fur;
        }
        if(j==tar){
           return true;
        }
        return false;
        
    }
}