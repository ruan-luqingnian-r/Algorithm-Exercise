package sort;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/13 17:26
 * @Description: 所有排序算法
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {12,312,421,23,233,2,234,1,2,4,23,13,412,41,3,2,123,124,121,412,1,123};

        System.out.println(Arrays.toString(arr));
    }

    //冒泡
    public static void bubbleSort(int[] arr){
        int temp = 0;//辅助变量用于

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
    //选择排序
    public static void selectSort(int[] arr){

    }
}
