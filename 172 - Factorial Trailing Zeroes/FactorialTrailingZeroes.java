public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        if (n == 0)
            return 0;

        int result = 0;

        while (n >= 1) {
            n /= 5;
            result += n;
        }

        return result;
    }
}
