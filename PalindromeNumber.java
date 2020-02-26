public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int second_half = 0;
        while(second_half < x) {
            second_half = (second_half * 10) + (x % 10);
            x /= 10;
        }

        return x == second_half || x == (second_half / 10);
    }
}
