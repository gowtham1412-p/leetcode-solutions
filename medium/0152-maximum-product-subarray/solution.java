class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pro=0;
        for(int i=1;i<n;i++){
              pro*=nums[i];
        }
    }
        return max;
            for(int j=i;j<n;j++){
            max=Math.max(max,pro);
            
            }  
}
