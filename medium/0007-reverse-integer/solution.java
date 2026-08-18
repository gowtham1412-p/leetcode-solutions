class Solution {
    public int reverse(int x) {
        int digit;
        int rev=0;
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
        }
    }
            x=x/10;
        return x;
}
