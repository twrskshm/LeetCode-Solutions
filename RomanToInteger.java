import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hash_map = new HashMap();
        hash_map.put('I', 1);
        hash_map.put('V', 5);
        hash_map.put('X', 10);
        hash_map.put('L', 50);
        hash_map.put('C', 100);
        hash_map.put('D', 500);
        hash_map.put('M', 1000);

        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i != 0 && hash_map.get(s.charAt(i - 1)) < hash_map.get(s.charAt(i))) {
                result += hash_map.get(s.charAt(i)) - (2 * hash_map.get(s.charAt(i - 1)));
            } else {
                result += hash_map.get(s.charAt(i));
            }
        }

        return result;
    }
}
