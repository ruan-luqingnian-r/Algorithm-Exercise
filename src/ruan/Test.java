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
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectSort(int[] arr){
        int temp = 0;//辅助变量用于交换数字
        for (int i = 0; i < arr.length - 1; i++) {
            //每次排序默认第一个数字是最小的
            int minPos = i;
            //遍历后续数字并与之比较直到找到最小数字的下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //找到最小数字的下标，开始交换啷个数字
            temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

}
