class Solution {

    public String encode(List<String> strs) {
         String ans = "";

         if(strs.size()==0) return ans;

         for(String s : strs){
            int len = s.length();
            ans += len+"#"+s;
         }

         System.out.println(ans);
         return ans;
    }
    //5#Hello5#
    //012345678
    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        if(str == "") return ls;
        int i = 0;
        while(i<str.length()){
            String s_len = "";
            while(str.charAt(i)!='#'){
                 s_len += str.charAt(i);
                 i++;
            }
            // System.out.println(s_len);
            int i_len = Integer.parseInt(s_len);
            String word = "";
            int j = i+1;
            
            int c = 0;
            while(c<i_len){
                word += str.charAt(j);
                j++;
                c++;
            }
            i = j;
            ls.add(word);
        }
        return ls;
    }
}
