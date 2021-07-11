package ruan;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/10 17:03
 * @Description: 排序算法练习
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {12,323,12,12,412,312,4,2,12};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 冒泡排序
     * 排序思路：
     * 1.比较数组第一个数字与其下一个数字的大小
     * 2.如果第一个数字比下一个大则两者交换
     * 3.直到数组尾部这是最大的数字
     * @param arr 待排序数组
     */
    public static void BubbleSort(int[] arr){
        int temp = 0;//用于交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    //交换两个数字
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }



}
