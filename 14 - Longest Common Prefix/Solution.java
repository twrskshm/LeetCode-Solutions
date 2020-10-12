/*
14. Longest Common Prefix

Time complexities:
Worst case: O(n)
Best case: O(1)

Space complexity:
Worst case: O(1)
Best case: O(1)

n: characters in the shortest string
*/

public class Solution {
    public String longestCommonPrefix(final String[] strs) {
        String result = "";

        outer: for (int characterIndex = 0; ; characterIndex++) {
            char previousCharacter = '-';

            for (int strsIndex = 0; strsIndex < strs.length; strsIndex++) {
                if ((characterIndex == strs[strsIndex].length()) || (strsIndex > 0 && strs[strsIndex].charAt(characterIndex) != previousCharacter)) {
                    break outer;
                } else if (previousCharacter == '-') {
                    previousCharacter = strs[strsIndex].charAt(characterIndex);
                }
            }

            if (previousCharacter == '-') {
                break;
            }

            result += previousCharacter;
        }

        return result;
    }
}

