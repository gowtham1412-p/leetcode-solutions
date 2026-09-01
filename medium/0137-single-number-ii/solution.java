class Solution {
    public int singleNumber(int[] nums) {
        int sn=0;
        int n=nums.length;
        for(int num:nums){
        int count=0;
        for(int i=0;i<n;i++){
                if(nums[i] == num){
                    count++;
                }
        }
                if(count==1)
                   return num;
        }
        return 0;
}
}