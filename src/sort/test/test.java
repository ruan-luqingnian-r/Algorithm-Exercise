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
        //int[] sort = bubbleSort(arr);
        int[] sort = insertSort(arr);
        System.out.println(Arrays.toString(sort));
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
    public static int[] selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            //交换数字
            if (index != i){
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

    /**
     * 插入排序
     */
    public static int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index] > min){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = min;
        }

        return arr;
    }
}
