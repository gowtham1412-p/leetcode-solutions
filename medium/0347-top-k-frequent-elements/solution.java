class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;

    }
}