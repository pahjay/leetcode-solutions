/**
 * Created by dev on 6/13/2017.
 */
public class Easy_7_ReverseInteger {
    public static int reverse(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        int reverse;

        int start = 0, end = chars.length-1;
        while(end>start){
            if (chars[start] == '-') ++start;
            char t = chars[start];
            chars[start++] = chars[end];
            chars[end--] = t;
        }

        try {
            return Integer.valueOf(String.valueOf(chars));
        } catch (Exception e) {
            return 0;
        }

    }

    public static void main(String[] agrs) {
        int i = -901000;
        System.out.println(reverse(i));

    }
}
