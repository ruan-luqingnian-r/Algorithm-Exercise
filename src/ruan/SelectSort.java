package ruan;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/9 15:28
 * @Description: 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,1,8,6,9};
        System.out.println("排序前:" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        //假设最小值的位置是第一个
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            //遍历数组找到真正的最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //交换两个数字
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
            System.out.println("第" + (i+1) + "次排序:" + Arrays.toString(arr));
        }
    }

}
