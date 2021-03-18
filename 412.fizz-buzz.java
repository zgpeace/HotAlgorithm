/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1, fizz = 3, buzz = 5; i <= n; i++) {
            if (i == fizz && i == buzz) {
                list.add("FizzBuzz");
                fizz += 3;
                buzz += 5;
            } else if (i == fizz) {
                list.add("Fizz");
                fizz += 3;
            } else if (i == buzz) {
                list.add("Buzz");
                buzz += 5;
            } else {
                list.add(String.valueOf(i));
            }            
        }

        return list;
    }
}
// @lc code=end

