package leetcode.Algorithm;

/**
 * 整数转罗马数字
 * @author bin
 * @date 2023-07-03-15:04
 */
public class IntToRoman12 {

    public static void main(String[] args) {
        IntToRoman12 intToRoman = new IntToRoman12();
        System.out.println(intToRoman.intToRoman(999));
        System.out.println(intToRoman.intToRoman2(999));
    }

    public String intToRoman(int num) {
        Object[][] roman = {
                {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"},
                {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1},
        };
        String str = "";

        for (int i=0; i<roman[0].length; i++) {
            while(num >= (int)roman[1][i]) {
                str += roman[0][i];
                num -= (int)roman[1][i];
            }
        }

        return str;
    }

    // 解法2
    public String intToRoman2(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + hundreds[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10];
    }

}
