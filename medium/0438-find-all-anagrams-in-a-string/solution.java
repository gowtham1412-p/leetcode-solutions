class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length();
        int m=p.length();

        int a[]=new int[26];
        int b[]=new int[26];
        if(m>n)
           return ans;
        for(int i=0;i<m;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }   
        for(int i=0;i<=n-m;i++){
            if(Arrays.equals(a,b)){
                ans.add(i);
            }
            if(i+m<n){
                b[s.charAt(i)-'a']--;
                b[s.charAt(i+m)-'a']++;
            }
        }
        return ans;

    }
}