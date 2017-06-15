/**
 * Created by dev on 6/14/2017.
 */
public class Easy_9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed*10 + x%10;
            x=x/10;
        }
        return (x == reversed || x == reversed/10); // x==reversed/10 accounts for odd numbers
    }
}
