class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[1]-a[1]);

        int ans[] = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int a[] = new int[2];
            a[0] = e.getKey();
            a[1] = e.getValue();
            pq.offer(a);
        }

        for(int i=0;i<k;i++){
            int t[] = pq.poll();
            ans[i] = t[0];
        }

        return ans;
    }
}
