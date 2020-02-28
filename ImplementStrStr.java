public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0) return 0;

        outer: for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            for(int j = i; j < i + needle.length(); j++) {
                if(haystack.charAt(j) != needle.charAt(j - i)) {
                    continue outer;
                }
            }

            return i;
        }

        return -1;
    }
}
