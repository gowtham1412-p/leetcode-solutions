class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        char chi[]=t.toCharArray();
        Arrays.sort(chi);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=chi[i]){
                return false;

            }
        }
        return true;
    }
}