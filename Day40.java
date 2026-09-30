import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        int[] freq = new int[26];

    
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int[] window = new int[26];

        // first window
        for (int i = 0; i < p.length(); i++) {
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq, window)) {
            ans.add(0);
        }


        
        for (int i = p.length(); i < s.length(); i++) {

            // naya character add
            window[s.charAt(i) - 'a']++;

            // purana character remove
            window[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(freq, window)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}