class Solution {
    public boolean isPalindromic(String s) {
        if(s==null){
            return false;
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            
            int lnum=s.charAt(l);
            int rnum=s.charAt(r);
            if(!Character.isLetterOrDigit(lnum)){
                l++;
            }
            else if(!Character.isLetterOrDigit(rnum)){
            r--;
            }else{
                if(Character.toLowerCase(lnum)!=Character.toLowerCase(rnum)){
                    return false;
                }
            
                l++;
                r--;
            }
        }
        return true;
    }
}