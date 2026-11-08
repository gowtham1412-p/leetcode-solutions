class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int ss[]=new int[256];
        int tt[]=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
             char ch2=t.charAt(i);
             if(ss[ch1]!=tt[ch2]){
                return false;
             }
             ss[ch1]=i+1;
             tt[ch2]=i+1;
        }
        return true;
    }
}