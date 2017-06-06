package solutions;

/**
 * Created by ryan on 3/1/17.
 *
 * LeetCode Problem Description: https://leetcode.com/problems/number-complement/?tab=Description
 */


public class NumberComplement
{
    public static int findComplement(int num)
    {
        String x = Integer.toBinaryString(num);
        String r = "";
        // System.out.println(x);

        for (int i = 0; i < x.length(); i++)
        {
            //System.out.println(x.charAt(i));
            if (x.charAt(i) == '0') r += '1';
            else                  r += '0';
        }

        int temp = (int) Long.parseLong(r, 2);
         return temp;
    }
    public static void main(String[] args)
    {
        System.out.println(findComplement(20161211));
    }
}
