/**
 *  https://leetcode.com/problems/single-number/#/description
 *  rationale: bitwise XOR returns 0 if all bits are the same, and
 *  the number if comparing bits to 0.
 */
public class Easy_136_SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }
}
