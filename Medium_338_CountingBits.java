/**
 * https://leetcode.com/problems/counting-bits/?tab=Description
 * Created by ryan on 3/6/17.
 * rationale: map out the pattern and find the function
 * - we find that the function is result[index] = result[index - bit offset] + 1
 */
public class Medium_338_CountingBits
{
    public static int[] countBits(int num) {
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

    public static void main(String[] args) {
        int[] result = countBits(1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
