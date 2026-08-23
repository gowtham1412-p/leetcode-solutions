           if(i>=k){
            wds-=nums[i-k];
            set.remove(nums[i-k]);
           }
           if(i>=k-1 && set.size()==k){

           set.add(nums[i]);
           wds+=nums[i];
        for(int i=0;i<n;i++){
        HashSet<Integer>set=new HashSet<>();
        long maxs=0;
        long wds=0;
        int n=nums.length;
    public long maximumSubarraySum(int[] nums, int k) {
class Solution {
            maxs=Math.max(wds,maxs);
