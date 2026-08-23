        int n=nums.length;
        int ls=0;
        int ttlsum=0;
        for(int i=0;i<n;i++){
            ttlsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            int rs=ttlsum-ls-nums[i];
        }
            if(ls==rs){
                return i;
            }
            ls+=nums[i];
    public int pivotIndex(int[] nums) {
class Solution {
