import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash_map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(hash_map.containsKey(complement)) {
                return new int[] {hash_map.get(complement), i};
            } else {
                hash_map.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
