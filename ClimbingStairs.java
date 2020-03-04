public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n < 2) return 1;

        int[] dynamic_programming = {1, 1};

        for(int i = 2; i <= n; i++) {
            int temp = dynamic_programming[1];
            dynamic_programming[1] += dynamic_programming[0];
            dynamic_programming[0] = temp;
        }

        return dynamic_programming[1];
    }
}
