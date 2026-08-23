class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1;
        int count=0;
        int i=0;
        int n=nums.length;
       for(int j=0;j<n;j++){
        product*=nums[j];
        while(product>=k){
            product/=nums[i];
            i++;
        }
        count+=j-i+1;
       }
       return count;
    }
}