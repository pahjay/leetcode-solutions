/**
 *  https://leetcode.com/problems/longest-uncommon-subsequence-i/#/description
 *  rationale: this problem asked for the longest uncommon subsequence. If the strings
 *  are not equal, the longer string is the longest uncommon subsequence.
 */
public class Easy_521_LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
