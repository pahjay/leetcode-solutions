import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * Created by ryan on 3/2/17.
 *
 * https://leetcode.com/problems/next-greater-element-i/?tab=Description
 */
public class NextGreaterElementI
{
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] ret = new int[findNums.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) map.put(nums[i], -1);
            else map.put(nums[i], stack.peek());
            stack.push(nums[i]);
        }
        for(int i = 0; i < findNums.length; i++) {
            ret[i] = map.get(findNums[i]);
        }
        return ret;
    }

    // test drive set to ludicrous speed
    public static void main(String[] args)
    {
        int[] a = {2,4};
        int[] b = {1,2,3,4};
        int[] c = nextGreaterElement(a,b);

        for (int d : c)
        {
            System.out.println(d);
        }
    }
}
