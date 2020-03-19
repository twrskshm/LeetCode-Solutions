public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;

            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                result = Math.max(result, sum);
            }
        }

        return result;
    }

    // Kadane's algorithm
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;

        int sum = 0, result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            result = Math.max(result, sum);
        }

        return result;
    }
}
