public class SqrtX {
    public static int mySqrt(int x) {
        if(x == 0) return x;

        int left = 1, right = x;
        while(true) {
            int mid = (right + left) / 2;
            if(mid > x / mid) {
                right = mid - 1;
            } else {
                if((mid + 1) > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
    }
}
