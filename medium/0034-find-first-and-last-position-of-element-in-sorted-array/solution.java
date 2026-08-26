            }else{
                right=mid-1;
            }

        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
               

            }else if(mid<target){
                left=mid+1;
            }else{
                right=mid-1;
