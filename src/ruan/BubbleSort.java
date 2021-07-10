package ruan;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/10 17:21
 * @Description: 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {123,23,12,42,1234,2,12,34,212,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //比较当前数字和下一个数字的大小
                if (arr[j] > arr[j + 1]){
                    //两数交换位置
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }



}
