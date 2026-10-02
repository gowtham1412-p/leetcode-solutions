class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n=nums.length;
        int range=(1<<n);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<range;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    temp.add(nums[j]);
                }
            }
            if(temp.size()>=2&&valid(temp)){
                res.add(temp);
            }
        }
        return new ArrayList<>(res);
       
    }
    static boolean valid(List<Integer>temp){
        for(int j=1;j<temp.size();j++){
            if(temp.get(j)<temp.get(j-1)){
                return false;
            }
        }
        return true;
}
}