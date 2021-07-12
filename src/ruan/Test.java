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
        Test test = new Test();
        test.quickSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序(O) n^2
     * 排序思路：
     * 1.比较数组第一个数字与其下一个数字的大小
     * 2.如果第一个数字比下一个大则两者交换
     * 3.直到数组尾部这是最大的数字
     * @param arr 待排序数组
     */
    public void BubbleSort(int[] arr){
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

    /**
     * 选择排序
     * 1.以第一个数值为数组最小值
     * 2.遍历数组找到最小数的下标
     * 3.交换两个数值
     * @param arr 待排序数组
     */
    public void selectSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //假设第一个数是最小的
            int minPos = i;
            //寻找最小的下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //找到最小数值的下标，交换两个值
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

    }

    /**
     * 快速排序
     * 1.核心思想是递归
     * 2.
     * @param arr 待排序数组
     * @param left 待排序数组左索引
     * @param right 待排序数组右索引
     */
    public void quickSort(int[] arr,int left,int right){
        int l = left;
        int r = right;
        int midValue = arr[(left + right) / 2];//数组中轴
        int temp = 0;
        while (r > l){
            //调整该该交换的下标
            while (arr[r] > midValue){
                r--;
            }
            while (arr[l] < midValue){
                l++;
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
        //防止数据溢出
        if (l == r){
            l++;
            r--;
        }
        //进行递归
        if (l < right){
            //向右
            quickSort(arr, l, right);
        }
        if (r > left){
            //向右
            quickSort(arr, left, r);
        }
    }



}
