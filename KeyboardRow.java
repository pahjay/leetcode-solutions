package solutions;

import java.util.ArrayList;

/**
 * Created by ryan on 3/2/17.
 * https://leetcode.com/problems/keyboard-row/?tab=Description
 */
public class KeyboardRow
{
    // check location of first letter
    // iterate through and check remaining letters
    // add new
    public static String[] findWords(String[] words)
    {
        String upperS = "QWERTYUIOP";
        String middleS = "ASDFGHJKL";
        String lowerS = "ZXCVBNN";
        ArrayList<String> correct = new ArrayList<>();


        for (int i = 0; i < words.length; i++)
        {
            String firstLetter = Character.toString(Character.toUpperCase(words[i].charAt(0)));
            String word = words[i];

            if (upperS.contains(firstLetter))
            {
                for (int j = 0; j < word.length(); j++)
                {
                    String t = Character.toString(Character.toUpperCase(word.charAt(j)));
                    if (!upperS.contains(t)) break;
                    if (j == word.length() - 1) correct.add(word);
                }
            } else if (middleS.contains(firstLetter))
            {
                for (int j = 0; j < word.length(); j++)
                {
                    String t = Character.toString(Character.toUpperCase(word.charAt(j)));
                    if (!middleS.contains(t)) break;
                    if (j == word.length() - 1) correct.add(word);
                }
            } else
            {
                for (int j = 0; j < word.length(); j++)
                {
                    String t = Character.toString(Character.toUpperCase(word.charAt(j)));
                    if (!lowerS.contains(t)) break;
                    if (j == word.length() - 1) correct.add(word);
                }

            }
        }
        String[] t = new String[correct.size()];
        t = correct.toArray(t);

        return t;
    }

    public static void main(String[] args)
    {
        String[] tester = {"asdfghjkl", "qwertyuiop", "zxcvbnm"};
        String[] answers = findWords(tester);

        for (String s : answers)
            System.out.print(s + " ");

    }
}
