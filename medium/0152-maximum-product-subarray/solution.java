class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        
        int prefix=1,suffix=1;
         for(int i=0;i<n;i++){
            if(prefix==0)
                 prefix=1;
            if(suffix==0)
                suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-1-i];
            max=Math.max(max,Math.max(prefix,suffix));
         }
         return max;
    }
}