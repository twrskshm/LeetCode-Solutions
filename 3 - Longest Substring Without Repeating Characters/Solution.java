/*
3. Longest Substring Without Repeating Characters

3.1 Method one:
Time complexities:
Worst case: O(n^2)
Best case: O(n^2)

Space complexity:
Worst case: O(n)
Best case: O(n)

3.2 Method two:
Time complexities:
Worst case: O(n)
Best case: O(n)

Space complexity:
Worst case: O(n)
Best case: O(n)
*/

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(final String s) {
        int result = 0;

        for (int iterator = 0; iterator < s.length(); iterator++) {
            HashSet<Character> uniqueCharacters = new HashSet<>();
            int currentSum = 0;

            for (int index = iterator; index < s.length(); index++) {
                char character = s.charAt(index);

                if (uniqueCharacters.contains(character)) {
                    break;
                }

                uniqueCharacters.add(character);
                result = Math.max(result, ++currentSum);
            }
        }

        return result;
    }

    public int lengthOfLongestSubstring(final String s) {
        int result = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        HashMap<Character, Integer> uniqueCharacters = new HashMap<>();

        for (; rightIndex < s.length(); rightIndex++) {
            char character = s.charAt(rightIndex);

            if (uniqueCharacters.containsKey(character) && leftIndex <= uniqueCharacters.get(character)) {
                result = Math.max(result, rightIndex - leftIndex);
                leftIndex = uniqueCharacters.get(character) + 1;
            }

            uniqueCharacters.put(character, rightIndex);
        }

        result = Math.max(result, rightIndex - leftIndex);

        return result;
    }
}
