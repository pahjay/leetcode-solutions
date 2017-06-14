/**
 * Created by dev on 6/7/2017.
 */
public class Easy_520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length()-1; i++) {
            if (Character.isUpperCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i+1))) { return false; }
            if (Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i+1))) { return false; }
        }
        return true;
    }
}
