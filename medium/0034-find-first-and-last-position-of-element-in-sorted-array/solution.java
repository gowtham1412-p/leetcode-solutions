class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }else if(nums[i]>target)
                break;
            }
        return new int[]{first,last};
