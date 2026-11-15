class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int count[]=new int[256];
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
        }
        char ch[]=new char[n];
        int k=0;
        for(int f=n;f>=1;f--){
            for(int i=0;i<256;i++){
                 if(count[i]==f){
                    for(int j=0;j<f;j++){
                        ch[k++]=(char)i;
                    }
                 }
            }
        }
        return new String(ch);
    }
}