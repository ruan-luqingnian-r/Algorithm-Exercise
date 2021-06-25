package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @PackgeName: sort
 * @ClassName: QuickSort
 * @Author: 小天才
 * Date: 2021/6/21 7:30
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {12312,312,312,312,124,123,12,31};
        int[] sort = sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sort));
//        //性能测试
//        int[] arr = new int[80000000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 800000);//[0,8000000)的随机数
//        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S");
        String date1Ser = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:"+date1Ser);
        sort(arr,0,arr.length - 1);
        Date date2 = new Date();
        String date2Ser = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是:"+date2Ser);
    }
    public static int[] sort(int[] arr,int left,int right){
        int l = left;//左索引
        int r = right;//右索引
        int pivot = arr[(left + right) / 2];//中轴
        int temp = 0;

        while (r > l){
            while (arr[l] < pivot){
                l++;
            }
            while (arr[r] > pivot){
                r--;
            }
            if (l >= r){
                break;
            }

            //开始交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot){
                r--;
            }
            if (arr[r] == pivot){
                l++;
            }
        }
        //防止溢出
        if (l == r){
            l = l + 1;
            r = r - 1;
        }
        if (left < r){
            //向左递归
            sort(arr, left, r);
        }
        if (right > l ){
            sort(arr, l, right);
        }

        return arr;
    }
}
