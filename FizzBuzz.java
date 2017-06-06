package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 3/2/17.
 *
 * https://leetcode.com/problems/fizz-buzz/?tab=Description
 */
public class FizzBuzz
{
    public static List<String> fizzBuzz(int n)
    {
        List<String> lst = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0 && i % 3 == 0)
                lst.add("FizzBuzz");

            else if (i % 5 == 0)
                lst.add("Buzz");

            else if (i % 3 == 0)
                lst.add("Fizz");

            else
                lst.add(Integer.toString(i));
        }

        return lst;
    }

    public static void main(String[] args)
    {
        List<String> test = fizzBuzz(15);

        for (Object c : test)
        {
            System.out.println(c);
        }

    }
}
