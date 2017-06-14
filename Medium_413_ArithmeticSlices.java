/**
 *  https://leetcode.com/problems/arithmetic-slices/#/description
 *  Rationale: every time you find a new 3-element segment in series, you are essentially increasing the size of all
 *  existing elements.
 */
public class Medium_413_ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int current = 0;
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                current++;
                sum += current;
            } else {
                current = 0; // reached break point, series interrupted
            }
        }
        return sum;
    }
}
