class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return nums;
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast())  deque.removeLast();
            deque.addLast(nums[i]);
        }
        result[index++] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == deque.peekFirst()) deque.removeFirst();
            while (!deque.isEmpty() && nums[i] > deque.peekLast())  deque.removeLast();
            deque.addLast(nums[i]);

            result[index++] = deque.peekFirst();
        }

        return result;
    }
}