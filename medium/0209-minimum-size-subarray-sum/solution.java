        for(int j=0;j<n;j++){
            sum+=nums[j];
        }
            while(sum>=target){
              res=Math.max(res,j-i+1);
            }
        int res=Integer.MAX_VALUE;
           
              sum-=nums[i];
              i++;
        int sum=0;
        int i=0;
        int n=nums.length;
        return res==Integer.MAX_VALUE ? 0:res;
        
}
}
