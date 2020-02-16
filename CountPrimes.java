public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] is_prime = new boolean[n];

        for(int i = 0; i < n; i++) {
            is_prime[i] = true;
        }

        for(int i = 2; i * i < n; i++) {
            if(is_prime[i]) {
                for(int j = i; j * i < n; j++) {
                    is_prime[i * j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(is_prime[i]) {
                count++;
            }
        }

        return count;
    }
}
