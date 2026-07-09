class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        int ans[] = new int[2];
       

        for(int i=0;i<nums.length;i++){
            int findPair = target - nums[i];
           
            if(mp.containsKey(findPair)){
                ans[0] = mp.get(findPair);
                ans[1] = i;
                return ans;
            }

            mp.put(nums[i],i);
        }

        return new int[2];

    }
}
