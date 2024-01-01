package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bin
 * @date 2024-01-01 14:28
 */
public class nowCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 第一行输入
        String numStr = scanner.nextLine();

        // 第二行输入
        int row = scanner.nextInt();
        int line = scanner.nextInt();

        // 把第一行的输入转成二维数组
        String[] numArr = numStr.split(" ");
        int[][] numData = new int[numArr.length / 2][2];
        int i=-1, j=0;
        for (int k=0; k < numArr.length; k++) {
            if(k%2 == 0) i++;
            numData[i][j++%2] = Integer.parseInt(numArr[k]);
        }

        // for (int[] numDatum : numData) {
        //     System.out.println(Arrays.toString(numDatum));
        // }
        // System.out.println(row);
        // System.out.println(line);
        // 10 10 56 34 99 1 87 8 99 3 255 6 99 5 255 4 99 7 255 2 99 9 255 21
        // 3 4
        // 算出要的是第几个的数的灰度值
        int num = row * numData[0][1] + line + 1;

        for (int m=1; m < numData.length; m++) {
            num = num - numData[m][1];
            if(num <= 0) {
                System.out.println(numData[m][0]);
                break;
            }
        }
    }
}
