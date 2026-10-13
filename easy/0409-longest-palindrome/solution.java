class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1){
                count++;
            }else{
                count--;
            }
        }
            if(count>1){
                return n-count+1;
            }
            return n;
    }
}