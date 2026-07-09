class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        Map<String,List<String>> mp = new HashMap<>();
        List<String> l = new ArrayList<>();
        for(String s : strs){
            char charArr[] = s.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = String.valueOf(charArr);
           
            if(!mp.containsKey(sortedWord)){
               mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(s);          
        }

        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}
