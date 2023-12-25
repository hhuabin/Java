package nowcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bin
 * @date 2023-12-25 11:29
 */
public class MergeString {

    public static void main(String[] args) {
        Map<Character,Character> hashMap = new HashMap<Character,Character>(){{
            put('0', '0');
            put('1', '8');
            put('2', '4');
            put('3', 'C');
            put('4', '2');
            put('5', 'A');
            put('6', '6');
            put('7', 'E');
            put('8', '1');
            put('9', '9');
            put('a', '5');
            put('b', 'D');
            put('c', '3');
            put('d', 'B');
            put('e', '7');
            put('f', 'F');
            put('A', '5');
            put('B', 'D');
            put('C', '3');
            put('D', 'B');
            put('E', '7');
            put('F', 'F');
        }};

        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        String resultStr = str.replace(" ", "");
        char[] resultArr = resultStr.toCharArray();

        // 偶数位
        Character[] arr2 = new Character[resultStr.length() / 2];
        // 基数位
        Character[] arr1 = new Character[resultStr.length() - resultStr.length() / 2];
        System.out.println(resultArr.length);

        for (int i =0; i < resultArr.length; i++) {
            if(i % 2 == 0) {
                arr1[i/2] = resultArr[i];
            } else {
                arr2[i/2] = resultArr[i];
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i =0; i < resultArr.length; i++) {
            if(i % 2 == 0) {
                // arr1[i/2] = resultArr[i];
                resultArr[i] =hashMap.getOrDefault(arr1[i/2], arr1[i/2]);
            } else {
                // arr2[i/2] = resultArr[i];
                resultArr[i] = hashMap.getOrDefault(arr2[i/2], arr2[i/2]);
            }
        }

        String result = new String(resultArr);
        System.out.println(result);
    }
}
