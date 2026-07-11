class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        //2,3,4,4,5,10,20
        int l = 0;
        int maxLen = Integer.MIN_VALUE;
        //-1,-1,0,1,3,4,5,6,7,8,9
        //0,1,1,2,3,4,5,6
        for(int i=1;i<nums.length;i++){
           if(nums[i]-nums[i-1] == 1){
              l++;
           }
           else if( nums[i]-nums[i-1]  > 1){
            maxLen = Integer.max(maxLen,l);
            l = 0;
           }
        }
        maxLen = Integer.max(maxLen,l);
        return maxLen+1;
    }
}