class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int n=nums.length;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target){
              res=Math.min(res,j-i+1);
              sum-=nums[i];
              i++;
            }
           
        }
      return res==Integer.MAX_VALUE ? 0:res;
        
}
}