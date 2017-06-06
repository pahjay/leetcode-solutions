/**
 * https://leetcode.com/problems/counting-bits/?tab=Description
 * Created by ryan on 3/6/17.
 */
public class CountingBits
{
    public int[] countBits(int num) {
        int result[] = new int[num + 1];
        int offset = 1;
        for (int i = 1; i < num + 1; ++i){
            if (offset * 2 == i){
                offset *= 2;
            }
            result[i] = result[i - offset] + 1;
        }
        return result;
    }
}
