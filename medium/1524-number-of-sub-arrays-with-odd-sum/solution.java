class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int pre[]=new int[n+1];
        int count=0;
        int mod=(int)(1e9)+7;
        int odd=0;
        int even=1;
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+arr[i];
            if(pre[i+1]%2==0){
                count=(count+odd)%mod;
                even++;
            }else{
                count=(count+even)%mod;
                odd++;
            }
        }
        
        return count;
    }
}