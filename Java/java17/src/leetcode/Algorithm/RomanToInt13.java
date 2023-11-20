package leetcode.Algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * @author bin
 * @date 2023-07-03-16:06
 */
public class RomanToInt13 {

    public static void main(String[] args) {
        RomanToInt13 romanToInt = new RomanToInt13();
        System.out.println(romanToInt.romanToInt("CMLVIII"));
        System.out.println(romanToInt.romanToInt2("CMLVIII"));
    }

    public int romanToInt(String s) {
        Object[][] roman = {
                {'M', 'D', 'C', 'L', 'X', 'V', 'I', '0', '0'},
                {1000, 500, 100, 50, 10, 5, 1, 0, 0},
        };
        int num = 0, index = roman[0].length-3;

        while(s.length() > 0 && index >= 0) {
            char ch = s.charAt(s.length()-1);

            if((char)roman[0][index] == ch) {
                num += (int)roman[1][index];
                s = s.substring(0, s.length()-1);

            } else if((char)roman[0][index+1] == ch) {
                num -= (int)roman[1][index+1];
                s = s.substring(0, s.length()-1);

            } else if((char)roman[0][index+2] == ch) {
                num -= (int)roman[1][index+2];
                s = s.substring(0, s.length()-1);
            } else {

                System.out.println(num + " " + s + " " + index);
                index--;
            }
        }

        return num;
    }

    public int romanToInt2(String s) {
        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        Integer sum = 0;
        System.out.println(symbolValues);

        for (Integer i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            if(symbolValues.get(ch) < symbolValues.get(s.charAt(i + 1))) {
                sum -= symbolValues.get(ch);
            } else {
                sum += symbolValues.get(ch);
            }
        }
        sum += symbolValues.get(s.charAt(s.length()-1));
        return sum;
    }
}
