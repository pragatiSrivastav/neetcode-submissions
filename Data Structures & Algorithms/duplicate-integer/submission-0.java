class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i : nums){
            if(mp.containsKey(i)){
                return true;
            }
            mp.put(i,0);
        }
        return false;
    }
}
