class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        long sum=0;
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        int j=0;
        while(j<n){
           while(set.contains(nums[j])){
           set.remove(nums[i]);
           sum-=nums[i];
           i++;
           }
           set.add(nums[j]);
           sum+=nums[j];
            
           if(j-i+1==k){
                max=Math.max(max,sum);
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
           }
           j++;
        }
        return max;

    }
}