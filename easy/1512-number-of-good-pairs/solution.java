class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int ans=0;
         int cnt[]=new int[101];
         for(int num:nums){
            ans+=cnt[num]++;
         }
         return ans;
    }
}