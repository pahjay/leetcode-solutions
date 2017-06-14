import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Medium_406_QueueReconstructionByHeight
{
    /**
     * https://leetcode.com/problems/queue-reconstruction-by-height/?tab=Description
     *
     * Analysis:
     *      1. Sort array by height
     *      2. Insert into ArrayList by amount in front of person
     *      3. Since it is already sorted, it will fill out correctly
     */
    public static int[][] reconstructQueue(int[][] people)
    {
        Arrays.sort(people, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        int N = people.length;
        ArrayList<int[]> temp = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            temp.add(people[i][1], new int[]{people[i][0], people[i][1]});
            for (int[] c : temp)
            {
                System.out.print(Arrays.toString(c) + " ");
            }
            System.out.println();
        }

        int[][] result = new int[people.length][2];
        int i = 0;
        for (int[] k : temp)
        {
            result[i][0] = k[0];
            result[i++][1] = k[1];
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[][] tester = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] result = reconstructQueue(tester);

        for (int[] c : result)
        {
            System.out.print(Arrays.toString(c) + " ");
        }

    }
}
