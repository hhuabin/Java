package nowcoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author bin
 * @date 2023-12-26 15:30
 */
public class Sudoku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] sudoArr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoArr[i][j] = scanner.nextInt();
            }
        }

        Sudoku.fillNumber(sudoArr);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillNumber(int[][] board) {

    }
}
