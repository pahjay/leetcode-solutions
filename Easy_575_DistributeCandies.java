import java.util.HashSet;

/**
 *      leetcode solution
 * ***************************
 * * 575. Distribute Candies *
 * ***************************
 * https://leetcode.com/problems/distribute-candies/#/description
 *
 * Rationale: max number of unique candies is N/2 where N is the total
 * amount of candies. Add numbers to HashSet and then the set either reaches the max
 * size or we return the lower of the two values if the number of unique ints is lower than
 * half the total size.
 */
public class Easy_575_DistributeCandies {
    public static int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
            for (int c : set) {
                System.out.println(c);
            }
            if (set.size() == candies.length / 2) {
                return set.size();
            }
        }
        return Math.min(set.size(), candies.length / 2);
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,4};
        System.out.println(distributeCandies(candies));
    }

}
