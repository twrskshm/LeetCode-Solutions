/*
7. Reverse Integer

Time complexities:
Worst case: O(n)
Best case: O(n)

Space complexity:
Worst case: O(1)
Best case: O(1)
*/

public class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10)) {
                return 0;
            }

            if ((result < Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            result = (result * 10) + lastDigit;
        }

        return result;
    }
}
