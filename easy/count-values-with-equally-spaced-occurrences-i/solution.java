class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
       int count2=0;
        for(int i=0;i<n;i++){
            int count1=0;
            int a1=-1,a2=-1,a3=-1;
            
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    count1++;
                
                if(a1==-1){
                    a1=j;
                }else if(a2==-1){
                    a2=j;
                }else if(a3==-1){
                    a3=j;
                }
                
            }
        }
            if(count1==3 && a2-a1==a3-a2){
                
                    count2++;
                
            }
    }
            
        
            return count2;
        
    }
}