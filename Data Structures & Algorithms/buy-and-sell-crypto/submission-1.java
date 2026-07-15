class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int mxp = 0;

        for(int i : prices){
            if(i<min){
                min = i;
            } else{
                if(mxp<i-min){
                    mxp = i - min;
                }
            }
        }

        return mxp;
    }
}
