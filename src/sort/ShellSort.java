package sort;

import java.util.Arrays;

/**
 * @PackgeName: sort
 * @ClassName: ShellSort
 * @Author: 小天才
 * Date: 2021/6/18 19:05
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {12,321312,312,421,312,3,142,13,12,421,3,124,12,1,31};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static int[] sort(int[] arr){
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0 ; gap  /= 2) {
            //分组
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0 ; j -= gap) {
                    if (arr[j] > arr[j + gap]){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
