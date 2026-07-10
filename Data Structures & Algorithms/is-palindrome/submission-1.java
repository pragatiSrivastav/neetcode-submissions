class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        String su = s.toUpperCase();
        String temp = "";
        for(char ch : su.toCharArray()){
           if((ch>='A' && ch<='Z') || (ch>='0' && ch<='9')) {
                 temp += ch;
           }       
        }
        int j = temp.length()-1;      
        while(i<j){
            if(temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }

        return true;

    }
}
