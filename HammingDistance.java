package solutions;

/**
 * Created by ryan on 3/1/17.
 *
 * LeetCode Problem @ https://leetcode.com/problems/hamming-distance/?tab=Description
 */
public class HammingDistance
{
    public static int hammingDistance(int x, int y)
    {
        int count = 0;
        String xs = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String xy = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');

        // for checking string correctness
        //System.out.println(xs);
        //System.out.println(xy);

        for (int i = 0; i < xs.length() || i < xy.length(); i++)
        {
            if (i > xs.length()- 1)
            {
                continue;
            }

            if (i > xy.length() - 1)
            {
                continue;
            }

            if (xs.charAt(i) != xy.charAt(i))
            {
                // for checking logic correctness
                //System.out.println("index: " + (i+1) + " | " + xs.charAt(i) + " does not equal " + xy.charAt(i));
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(hammingDistance(680142203,1111953568));
    }
}
