/*
9. Palindrome Number

Time complexities:
Worst case: O(n)
Best case: O(n)

Space complexity:
Worst case: O(1)
Best case: O(1)
*/

public class Solution {
    public boolean isPalindrome(int x) {
        if (x > 0 && x % 10 == 0) {
            return false;
        }

        int reversedX = 0;

        while (x > reversedX) {
            reversedX = (reversedX * 10) + (x % 10);
            x /= 10;
        }

        return x == reversedX || x == reversedX / 10;
    }
}
