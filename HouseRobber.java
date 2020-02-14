public class HouseRobber {
    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int[] dynamic_programming = new int[nums.length + 1];
        dynamic_programming[0] = 0;
        dynamic_programming[1] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            dynamic_programming[i + 1] = Math.max(dynamic_programming[i], dynamic_programming[i - 1] + nums[i]);
        }

        return dynamic_programming[nums.length];
    }
}
