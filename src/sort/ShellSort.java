package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @PackgeName: sort
 * @ClassName: ShellSort
 * @Author: 小天才
 * Date: 2021/6/18 19:05
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        //功能测试
        int[] arr = {12,321312,312,421,312,3,142,13,12,421,3,124,12,1,31};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        //性能测试
//        int[] arr = new int[80000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 800000);//[0,8000000)的随机数
//        }
//
//        Date date1 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S");
//        String date1Ser = simpleDateFormat.format(date1);
//        System.out.println("排序前的时间是:"+date1Ser);
//        sort(arr);
//        Date date2 = new Date();
//        String date2Ser = simpleDateFormat.format(date2);
//        System.out.println("排序后的时间是:"+date2Ser);

    }

    /**
     * 交换法
     */
//    public static int[] sort(int[] arr){
//        int temp = 0;
//        for (int gap = arr.length / 2; gap > 0 ; gap  /= 2) {
//            //分组
//            for (int i = gap; i < arr.length; i++) {
//                for (int j = i - gap; j >= 0 ; j -= gap) {
//                    if (arr[j] > arr[j + gap]){
//                        temp = arr[j];
//                        arr[j] = arr[j + gap];
//                        arr[j + gap] = temp;
//                    }
//                }
//            }
//        }
//
//        return arr;
//    }
    //移动法
    public static int[] sort(int[] arr){

        for (int gap = arr.length / 2; gap > 0 ; gap = gap / 2) {
            //分组
            for (int i = gap; i < arr.length ; i++) {
                int j = i;//保持下标
                int value = arr[i];
                if (arr[j] < arr[j - gap]){
                    while ((j - gap) >= 0 && value < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j = j - gap;
                    }
                    arr[j] = value;
                }

            }
        }

        return arr;
    }
}
