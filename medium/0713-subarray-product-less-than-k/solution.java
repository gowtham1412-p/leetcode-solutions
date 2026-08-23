        int n=nums.length;
       for(int j=0;j<n;j++){
        product*=nums[i];
       }
        while(product>=k){
            product/=nums[i];
        }
            i++;
        count+=j-i+1;
       return count;
    }
        int i=0;
        int count=0;
        long product=1;
    public int numSubarrayProductLessThanK(int[] nums, int k) {
class Solution {
}
