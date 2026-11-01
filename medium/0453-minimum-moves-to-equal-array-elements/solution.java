class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for(int i=1;i<n;i++){
               min=Math.min(nums[i],min);
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}