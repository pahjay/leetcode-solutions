import java.util.HashMap;

/**
 * Created by dev on 6/14/2017.
 */
public class Easy_13_RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                sum = sum - map.get(s.charAt(i));
            } else {
                sum = sum + map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCVI";
        System.out.println(romanToInt(s));
    }
}
