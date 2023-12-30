package nowcoder;

import java.util.Scanner;

/**
 * @author bin
 * @date 2023-12-28 9:52
 */

// 简单密码
public class SimplePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        SimplePassword.generateCode(s);
    }

    public static void generateCode(String string) {
        char[] charArray = string.toCharArray();

        // 48, 57
        // 65, 90 A~B
        // 97, 122 a~b
        for (int i=0; i < charArray.length; i++) {
            int num = (int) charArray[i];

            if(65 <= num && num < 90) {
                charArray[i] = (char) (charArray[i]  + 33);
            } else if (num == 90) {
                charArray[i] = 'a';
            } else if (97 <= num && num <= 122) {
                num = num - 97;      // 0-25
                if (num <= 14) {
                    charArray[i] = (char) (num / 3 + 2 + '0');
                } else if (num <= 18) {
                    charArray[i] = (char) (7 + '0');
                } else if (num <= 21) {
                    charArray[i] = (char) (8 + '0');
                } else if (num <= 25) {
                    charArray[i] = (char) (9 + '0');
                }
            }
        }

        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
