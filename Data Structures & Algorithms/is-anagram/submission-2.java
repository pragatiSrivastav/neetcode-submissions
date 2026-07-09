class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
      Map<Character, Integer> charCount = new HashMap<>();
        
        // Update counts for characters in both strings
        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
            charCount.put(t.charAt(i), charCount.getOrDefault(t.charAt(i), 0) - 1);
        }

        // Check if all counts are zero
        for (int count : charCount.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
