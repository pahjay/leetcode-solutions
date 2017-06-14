/**
 * Created by dev on 6/7/2017.
 */
public class Medium_495_TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        if (timeSeries.length == 1) { return duration; }
        for(int i = 0; i < timeSeries.length-1; i++) {
            if (timeSeries[i+1] - timeSeries[i] < duration) {
                    sum += timeSeries[i + 1] - timeSeries[i];
                } else {
                    sum += duration;
                }
            if (i + 1 == timeSeries.length-1) {
                sum += duration;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] t = {1};
        System.out.println(findPoisonedDuration(t, 100000));
    }
}
