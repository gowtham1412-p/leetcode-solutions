class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int left1=nums[0];
        int left2=nums[1];
        int right1=nums[n-1];
        int right2=nums[n-2];
        int right3=nums[n-3];
    }
        int pos=right1*right2*right3;
        int neg=left1*left2*right1;
        return Math.max(pos,neg);
        int n=nums.length;
        
}
