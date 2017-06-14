/**
 * Created by ryan on 3/1/17.
 * LeetCode Problem Description: https://leetcode.com/problems/two-sum/?tab=Description
 */
public class Easy_1_TwoSum
{
    public int[] twoSum(int[] numbers, int target) {
        int[] k = new int[2];
        if(numbers.length>=2){
            for(int x=0;x<numbers.length;x++){
                for(int y=x+1; y<numbers.length;y++){
                    if(numbers[x] + numbers[y] == target){
                        k[0] = x;
                        k[1] = y;
                        return k;
                    }
                }
            }
        }
        return k;
    }
}
