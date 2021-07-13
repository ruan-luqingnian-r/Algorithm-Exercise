package ruan;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/11 15:51
 * @Description:
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,123,5,8549,34276,123,52};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            //找到最大值
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]){
                    //交换两个数值
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }

}
