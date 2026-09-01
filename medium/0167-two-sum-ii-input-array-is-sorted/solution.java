        while(left<right){
            if(sum==target){
                   return numbers;
            }
        }
            int sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }
        return numbers;
    }
        int left=0,right=n-1;
        int n=numbers.length;
                numbers[0]=left;numbers[1]=right;
