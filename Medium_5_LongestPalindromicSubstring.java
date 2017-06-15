/**
 * Created by dev on 6/15/2017.
 */
public class Medium_5_LongestPalindromicSubstring {
    // set a pointer at the start of the string
    // expand out from that point, breaking if palindrome does not exist
    // move pointer right and repeat
    //
    int low, longest = 0;
    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length()-1; i++) {
            extendPalindrome(s, i, i); // if odd
            extendPalindrome(s, i, i+1); // if even (palindrome will be 1 short than correct if not included)
        }
        return s.substring(low, low + longest);
    }

    public void extendPalindrome(String s, int start, int end) {
        while (start > 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--; // move left
            end++; // move right
        }
        if (longest < end - start - 1) {
            low = start + 1; // starting index position
            longest = end - start - 1; // length of substring adjusted for pointer move on last iteration
        }
    }
}
