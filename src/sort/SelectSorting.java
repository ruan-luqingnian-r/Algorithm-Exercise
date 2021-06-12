package sort;

import java.util.Arrays;

/**
 * @PackgeName: sort
 * @ClassName: SelectSorting
 * @Author: 小天才
 * Date: 2021/6/12 19:27
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 选择排序
 */
public class SelectSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,23,4,2,4,21,3,12};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));

    }

    /**
     * 选择排序
     * @param arr 待排数组
     * @return 排序后的数组
     * 1.假设当前数字为最小的数字
     * 2.和后面的数字比较
     * 时间复杂度O(n^2)
     */
    public static int[] sort(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //将两个数字交换
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}
