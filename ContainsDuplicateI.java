import java.util.HashSet;

public class ContainsDuplicateI {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int x: nums) {
            if(hashSet.contains(x)) {
                return true;
            }
            hashSet.add(x);
        }

        return false;
    }
}
