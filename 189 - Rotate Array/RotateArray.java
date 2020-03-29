public class RotateArray {public static void rotate(final int[] nums, final int k) {
    int numsLength = nums.length;

    for (int i = 0; i < k; i++) {
        int previousNumber = nums[numsLength - 1];

        for (int j = 0; j < numsLength; j++) {
            int temporaryNumber = nums[j];
            nums[j] = previousNumber;
            previousNumber = temporaryNumber;
        }
    }
}

    public static void rotate(final int[] nums, final int k) {
        int numsLength = nums.length;

        for (int i = 0; i < k; i++) {
            int[] temporaryNums = new int[numsLength];
            temporaryNums[0] = nums[numsLength - 1];

            for (int j = 0; j < numsLength - 1; j++)
                temporaryNums[j + 1] = nums[j];

            for (int j = 0; j < numsLength; j++)
                nums[j] = temporaryNums[j];
        }
    }
}
