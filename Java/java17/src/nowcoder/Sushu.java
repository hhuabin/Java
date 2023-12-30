package nowcoder;

/**
 * @author bin
 * @date 2023-12-26 17:13
 */

import java.util.Scanner;

/**
 * 素数伴侣
 */
public class Sushu {

    public static void main(String[] args) {
        int maxLength = 0, flagLength = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] input = new int[num];

        for (int i = 0; i < num; i++) {
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(j == i) continue;
                if(Sushu.isSushu(input[i] + input[j])) {
                    flagLength ++;
                }
            }
            maxLength = Math.max(maxLength, flagLength);
            flagLength = 0;
        }

        System.out.println(maxLength);
    }

    public static boolean isSushu(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
