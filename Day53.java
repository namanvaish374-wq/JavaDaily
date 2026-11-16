class Solution {

    HashSet<String> dict;
    HashMap<Integer, List<String>> memo;

    public List<String> wordBreak(String s, List<String> wordDict) {

        dict = new HashSet<>(wordDict);
        memo = new HashMap<>();

        return dfs(s, 0);
    }

    private List<String> dfs(String s, int start) {

        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        List<String> ans = new ArrayList<>();

        if (start == s.length()) {
            ans.add("");
            return ans;
        }

        for (int end = start + 1; end <= s.length(); end++) {

            String word = s.substring(start, end);

            if (dict.contains(word)) {

                List<String> suffix = dfs(s, end);

                for (String str : suffix) {

                    if (str.equals("")) {
                        ans.add(word);
                    } else {
                        ans.add(word + " " + str);
                    }
                }
            }
        }

        memo.put(start, ans);

        return ans;
    }
}