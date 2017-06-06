import java.util.Arrays;

/**
 *      leetcode solution
 * ***************************
 * * 561. Array Partition I *
 * ***************************
 * https://leetcode.com/problems/array-partition-i/#/description
 *
 * Rationale: once we sort the array, the minimum of all (a,b) pairs is a. So we add the
 * odd elements, (1st, 3rd, 5th, etc) and get the sum of the min of the pairs.
 */
public class ArrayPartitionI_561_Easy {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
