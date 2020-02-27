public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int swap_index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[swap_index]) {
                nums[swap_index++ + 1] = nums[i];
            }
        }

        return ++swap_index;
    }
}
