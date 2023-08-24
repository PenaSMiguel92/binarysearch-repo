public class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] != target)
                return -1;
            else
                return 0;
        }

        int midIndex = nums.length / 2;
        if (nums[midIndex] == target)
            return midIndex;

        if (target > nums[midIndex]) {
            int[] next = new int[nums.length - midIndex];
            for (int i = 0; i < nums.length - midIndex; i++) {
                next[i] = nums[midIndex + i];
            }
            return binarySearch(next, target);
        } else {
            int[] next = new int[midIndex];
            for (int i = 0; i < midIndex; i++) {
                next[i] = nums[i];
            }
            return binarySearch(next, target);
        }
    }
} 
