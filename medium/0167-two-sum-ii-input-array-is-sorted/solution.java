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
}
