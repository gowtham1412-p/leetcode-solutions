class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<Integer>();
        int n=nums.length;
        for(int num:nums){
            set.add(num);
        }
        int ele=k;
        while(set.contains(ele)){
            ele+=k;
        }
return ele;
    }
}