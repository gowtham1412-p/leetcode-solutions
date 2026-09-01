            }
        }
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }
               return new int[]{left+1,right+1};
            if(sum==target){
        return new int[]{-1,-1};
    }
}
