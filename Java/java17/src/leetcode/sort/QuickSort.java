package leetcode.sort;

import java.util.Arrays;

/**
 * @author bin
 * @date 2023-12-18 21:33
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2, 7, 1, 4};

        quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] arr, int low, int high) {
        int temp = arr[low], i = low, j = high;
        while (i < j) {
            // 对比右侧
            while (i < j && temp <= arr[j]) j--;

            if(i < j) {
                arr[i] = arr[j];
                i++;
            }

            // 对比左侧
            while (i < j && arr[i] < temp) i++;

            if(i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = temp;
        if(low < i) quickSort(arr, low, i-1);
        if(i < high) quickSort(arr, j+1, high);
    }
}
