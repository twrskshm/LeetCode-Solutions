public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int swap_index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[swap_index++] = nums[i];
            }
        }

        return swap_index;
    }
}
