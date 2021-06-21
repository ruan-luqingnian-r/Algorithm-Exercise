package sort;

import java.util.Arrays;

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
    }
    public static int[] sort(int[] arr,int left,int right){
        int l = left;//左索引
        int r = right;//右索引
        int pivot = arr[(left + right) / 2];//中轴
        int temp = 0;

        while (r > l){
            if (arr[l] < pivot){
                l++;
            }
            if (arr[r] > pivot){
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
