/*
1. Two Sum

1.1 Method one:
Time complexities:
Worst case: O(n^2)
Best case: O(1)

Space complexity:
Worst case: O(1)
Best case: O(1)

1.2 Method two:
Time complexities:
Worst case: O(n)
Best case: O(1)

Space complexity:
Worst case: O(n)
Best case: O(1)
*/

import java.util.HashMap;

public class Solution {
    public int[] twoSum(final int[] nums, final int target) {
        for (int leftIndex = 0; leftIndex < nums.length - 1; leftIndex++) {
            for (int rightIndex = leftIndex + 1; rightIndex < nums.length; rightIndex++) {
                if (nums[leftIndex] + nums[rightIndex] == target) {
                    return new int[] {leftIndex, rightIndex};
                }
            }
        }

        return new int[] {};
    }

    public int[] twoSum(final int[] nums, final int target) {
        HashMap<Integer, Integer> elementsSeen = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int difference = target - nums[index];

            if (elementsSeen.containsKey(difference)) {
                return new int[] {elementsSeen.get(difference), index};
            }

            elementsSeen.put(nums[index], index);
        }

        return new int[] {};
    }
}
