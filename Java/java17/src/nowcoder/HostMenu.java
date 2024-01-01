package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bin
 * @date 2024-01-01 15:06
 */
public class HostMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int projectNum = scanner.nextInt();
        int watch = scanner.nextInt();
        int star = scanner.nextInt();
        int fork = scanner.nextInt();
        int issue = scanner.nextInt();
        int mr = scanner.nextInt();

/*
4
8 6 2 8 6
camila 66 70 46 158 80
victoria 94 76 86 189 211
anthony 29 17 83 21 48
emily 53 97 1 19 218
*/
        scanner.nextLine();
        String[] projectArr = new String[projectNum];
        for (int i = 0; i < projectNum; i++) {
            projectArr[i] = scanner.nextLine();
        }
        for (String s : projectArr) {
            System.out.println(s);
        }

        int[] score = new int[projectNum];
        for (int i = 0; i < projectNum; i++) {

            String[] split = projectArr[i].split(" ");
            int sum = watch * Integer.parseInt(split[1])
                    + star * Integer.parseInt(split[2])
                    + fork * Integer.parseInt(split[3])
                    + issue * Integer.parseInt(split[4])
                    + mr * Integer.parseInt(split[5]);

            score[i] = sum;
        }
        System.out.println(Arrays.toString(score));

        int[] arr = new int[score.length];
        System.arraycopy(score, 0, arr, 0, score.length);
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j=0; j < score.length; j++) {
                if(score[j] == arr[i]) {
                    System.out.println(projectArr[j].split(" ")[0]);
                }
            }
        }
    }
}
