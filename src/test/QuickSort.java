package test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.SimpleTimeZone;

/**
 * @Author: ruan
 * Date: 2021/7/5 8:20
 * @Description: 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
//        //功能测试
//        int[] arr = {123,123,42,123,2142,213,34};
//        int[] sort = sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(sort));
        //性能测试
        int[] arr = new int[80000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  random.nextInt(1) * 80000;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-S");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println("开始排序:" + format);
        sort(arr,0, arr.length -1);
        Date date1 = new Date();
        String format1 = simpleDateFormat.format(date1);
        System.out.println("排序完成:" + format1);


    }
    public static int[] sort(int[] arr,int left,int right){
        int l = left;//左索引
        int r = right;//右索引
        int value = arr[(left + right) / 2];
        int temp = 0;//辅助变量
        //调整索引位置
        while (r > l){
            if (arr[l] < value){
                l++;
            }
            if (arr[r] > value){
                r--;
            }
            if (l >= r){
                break;
            }
            //数据交换
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            if (arr[l] == value){
                r--;
            }
            if (arr[r] == value){
                l++;
            }
        }
        //防止溢出
        if (r == l){
            r--;
            l++;
        }
        if (left < r){
            //向左递归
            sort(arr, left, r);
        }
        if (right > l){
            //向右递归
            sort(arr, l, right);
        }
        return arr;
    }
}
