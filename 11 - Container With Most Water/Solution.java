/*
11. Container With Most Water

11.1 Method one:
Time complexities:
Worst case: O(n^2)
Best case: O(n^2)

Space complexity:
Worst case: O(1)
Best case: O(1)

11.2 Method two:
Time complexities:
Worst case: O(n)
Best case: O(n)

Space complexity:
Worst case: O(1)
Best case: O(1)
*/

public class Solution {
    public int maxArea(final int[] height) {
        int result = 0;

        for (int leftIndex = 0; leftIndex < height.length - 1; leftIndex++) {
            for (int rightIndex = leftIndex + 1; rightIndex < height.length; rightIndex++) {
                result = Math.max(result, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));
            }
        }

        return result;
    }

    public int maxArea(final int[] height) {
        int result = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        while (leftIndex < rightIndex) {
            result = Math.max(result, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return result;
    }
}

