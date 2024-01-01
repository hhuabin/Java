package nowcoder;

import java.util.Scanner;

/**
 * @author bin
 * @date 2024-01-01 16:00
 */
public class StaffNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ctnx = scanner.nextInt();
        int ctny = scanner.nextInt();
        int k = 0, m = 0, n = 0;

        for (int i = 1; i < Math.pow(10, 9); i++) {
            if(m >= ctnx && n >= ctny) {
                System.out.println(i-1);
                break;
            }
            if(i%x != 0 && i%y != 0) {
                if(m <= n) {
                    m++;
                } else {
                    n++;
                }
                continue;
            }
            if(i%x != 0) {
                m++;
                if(m <= ctnx) {
                    continue;
                }
            }
            if(i%y != 0) {
                n++;
            }
        }
    }
}
