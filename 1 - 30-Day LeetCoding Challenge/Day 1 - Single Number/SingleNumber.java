/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class SingleNumber {
    public static int singleNumber(final int[] nums) {
        int x = 0;

        for (int number: nums)
            x ^= number;

        return x;
    }
}
