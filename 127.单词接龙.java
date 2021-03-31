/*
 * @lc app=leetcode.cn id=127 lang=java
 *
 * [127] 单词接龙
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictSet = new HashSet<>(wordList);
        Set<String> visit = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int minLen = 1;
        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {
                String word = queue.poll();
                for (int k = 0; k < word.length(); k++) {
                    char[] ch = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == word.charAt(k)) 
                            continue;
                        ch[k] = c;
                        String newWord = String.valueOf(ch);
                        if (dictSet.contains(newWord) && visit.add(newWord)) {
                            if (newWord.equals(endWord))
                                return minLen + 1;
                            queue.add(newWord);
                        }
                    }
                }
            }
            minLen++;
        }
        return 0;
    }
}
// @lc code=end

