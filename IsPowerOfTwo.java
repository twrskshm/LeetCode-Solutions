public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        int x = 0;
        while(Math.pow(2, x) < n) {
            x++;
        }

        return Math.pow(2, x) == n;
    }
}