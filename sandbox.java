import java.util.HashMap;

/**
 * Created by dev on 6/15/2017.
 */
public class sandbox {
    public static int findLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0, longest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = map.get(s.charAt(i)) + 1; // move left pointer to one to the right of first char found
            }

            map.put(s.charAt(i), i); // assign new index value for char
            longest = Math.max(longest, map.get(s.charAt(i)) - j + 1);
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(findLongestSubstring(s));

    }
}
