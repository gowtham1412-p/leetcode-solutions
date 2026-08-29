        int n=nums.length;
        int leftsum=0;
        int rightsum=0;
        for(int num: nums){
            rightsum+=num;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            rightsum-=nums[i];
        }
            arr[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        return arr;
    public int[] leftRightDifference(int[] nums) {
    }
class Solution {
