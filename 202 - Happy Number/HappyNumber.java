import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seenBefore = new HashSet<>();

        while (n != 1) {
            if (seenBefore.contains(n))
                return false;

            int temporaryN = n, sum = 0;

            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            seenBefore.add(temporaryN);
            n = sum;
        }

        return true;
    }
}
