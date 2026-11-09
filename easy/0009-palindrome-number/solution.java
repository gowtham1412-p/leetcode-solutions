class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int digit=0;
        int x1=x;
        while(x>0){
            digit=(digit*10)+(x%10);
            x/=10;
        }
        return digit==x1;
    }
}