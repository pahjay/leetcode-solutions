import java.util.Arrays;

/**
 * Created by ryan on 3/6/17.
 * https://leetcode.com/problems/reverse-string/?tab=Description
 */
public class Easy_344_ReverseString
{
    public static String reverseString(String s)
    {
        char[] c = s.toCharArray();

        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
        {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
        }

        return new String(c);
    }

    public static void main(String[] args)
    {
        System.out.println(reverseString("abcde"));
    }
}
