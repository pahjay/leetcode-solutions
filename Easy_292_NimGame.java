/**
 * https://leetcode.com/problems/nim-game/?tab=Description
 */


public class Easy_292_NimGame
{
    /**
     * Rationale: The person who gets a number that is divisible by 4 will lose.
     */
    public boolean canWinNum(int n)
    {
        return n % 4 != 0;
    }

}
