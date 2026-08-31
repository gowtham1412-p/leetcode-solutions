        long n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        int pro=1;
            for(int j=i;j<n;j++){
              pro*=nums[j];
            max=Math.max(max,pro);
            
            }  
        }
        return max;
    }
}
    public int maxProduct(int[] nums) {
class Solution {
