            int mid=left+(right-left)/2;
        while(left<=right){
        }
            if(mid==target){
                last=mid;
                left=mid+1;
               

            }else if(mid<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return new int[]{first,last};
