package ruan;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/10 19:02
 * @Description:
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12312,12312,3,123,312,4,313,234,4,1213,312};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right){
        int l = left;//左端点值
        int r = right;//右端点值
        int midValue = arr[(left + right) / 2];//中间值
        int temp = 0;
        while (r > l) {
            //比较索引位置和中间值的大小
            while (arr[l] < midValue) {
                l++;
            }
            while (arr[r] > midValue) {
                r--;
            }
            if (l >= r){
                break;
            }
            //开始交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == midValue){
                r--;
            }
            if (arr[r] == midValue){
                l++;
            }
        }
        //防止溢出
        if (l == r){
            l++;
            r--;
        }
        if (l < right){
            //向右递归
            quickSort(arr, l, right);
        }
        if (r > left){
            //向左递归
            quickSort(arr, left, r);
        }
    }
}
