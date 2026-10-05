class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
           if(set.contains(ch)){
            return ch;
           }
           set.add(ch);
        }
        return ' ';
    }
}