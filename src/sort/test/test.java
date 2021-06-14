package sort.test;

import java.util.Arrays;

/**
 * @PackgeName: sort.test
 * @ClassName: test
 * @Author: 小天才
 * Date: 2021/6/14 16:32
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description:
 */
public class test {
    public static void main(String[] args) {

        int[] arr = {12,21,3,12312,412,412,123,123,123,14,12,123,124,12};
        int[] bubbleSort = bubbleSort(arr);
        System.out.println(Arrays.toString(bubbleSort));
    }

    /**
     * 冒泡
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1] ){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr){
        return arr;
    }
}
