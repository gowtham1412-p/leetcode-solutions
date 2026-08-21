class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(count>0){
                break;
            }
        }
        return count;
    }
}