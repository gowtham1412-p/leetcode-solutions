class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
           int k=0;
            while(k<i&&nums[k]!=nums[i])
                k++;
            if(k<i)
                continue;
            int j=i+1;
            while(j<n&&nums[j]==nums[i]){
                j++;
            }
            int g=j;
            while(g<n&&nums[g]!=nums[i])
                g++;
            if(g==n)
                count++;
        }
                return count;
    }
}