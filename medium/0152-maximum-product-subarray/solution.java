class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pro=0;
        for(int i=1;i<n;i++){
              pro*=nums[i];
        }
              if(pro>max){
                max=pro;
              }
    }
        return max;
}
