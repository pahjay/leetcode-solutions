/**
 * Created by dev on 6/17/2017.
 */
public class Medium_12_IntegerToRomanNumeral {
    public static String intToRoman(int num) {
        // all possible combinations
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] vals =     {1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vals.length; i++) {
            while (num >= vals[i]) { // move pointer once we are less than the current value
                sb.append(roman[i]);
                num -= vals[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(530));
    }
}
