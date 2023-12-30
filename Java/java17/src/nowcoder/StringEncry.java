package nowcoder;

import java.util.Scanner;

/**
 * @author bin
 * @date 2023-12-26 18:28
 */

/**
 * 字符串加解密
 */
public class StringEncry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String code1 = scanner.nextLine();

        String code2 = scanner.nextLine();

        char[] charArray1 = code1.toCharArray();

        char[] charArray2 = code2.toCharArray();

        char[] result1 = StringEncry.encode(charArray1);

        char[] result2 = StringEncry.decode(charArray2);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static char[] encode(char[] code) {
        // 48, 57
        // 65, 90
        // 97, 122
        int length = code.length;
        char[] resultArr = new char[length];

        for (int i=0; i < length; i++) {
            int asciiNum = (int) code[i];

            if(48 <= asciiNum && asciiNum < 57) {
                resultArr[i] = (char) (code[i] + 1);
            } else if (asciiNum == 57) {
                resultArr[i] = '0';
            } else if (65 <= asciiNum && asciiNum < 90) {
                resultArr[i] = (char) (code[i] + 33);
            } else if (asciiNum == 90) {
                resultArr[i] = 'a';
            } else if (97 <= asciiNum && asciiNum < 122) {
                resultArr[i] = (char) (code[i] - 31);
            } else if (asciiNum == 122) {
                resultArr[i] = 'A';
            }  else {
                resultArr[i] = code[i];
            }
        }

        return resultArr;
    }

    public static char[] decode(char[] code) {
        int length = code.length;

        char[] resultArr = new char[length];

        for (int i=0; i < length; i++) {
            int asciiNum = (int) code[i];

            if(48 < asciiNum && asciiNum <= 57) {
                resultArr[i] = (char) (code[i] - 1);
            } else if (asciiNum == 48) {
                resultArr[i] = '9';
            } else if (65 < asciiNum && asciiNum <= 90) {
                resultArr[i] = (char) (code[i] + 31);
            } else if (asciiNum == 65) {
                resultArr[i] = 'z';
            } else if (97 < asciiNum && asciiNum <= 122) {
                resultArr[i] = (char) (code[i] - 33);
            } else if (asciiNum == 97) {
                resultArr[i] = 'Z';
            }  else {
                resultArr[i] = code[i];
            }
        }

        return resultArr;
    }
}
