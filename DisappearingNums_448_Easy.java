import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 6/7/2017.
 */
public class DisappearingNums_448_Easy {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // index value of seen int
            if (index > 0) {
                nums[index] = -nums[index]; // set value of seen int to negative
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing.add(i+1);
            }
        }

        return missing;
    }
}
