class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                curr=(nums[i]-1)*(nums[j]-1);
               max=Math.max(max,curr);
    }
        int curr=0;
        }
            }
        return max;
}
