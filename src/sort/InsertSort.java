package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;




/**
 * @PackgeName: sort
 * @ClassName: InsertSort
 * @Author: 小天才
 * Date: 2021/6/13 14:53
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        //功能测试
//        int[] arr = {2,32,13,12,412,123,12,41};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
        //排序速度测试
        System.out.println("===排序性能测试===");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        int[] array = new int[80000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1) * 800000;
        }
        Date date1 = new Date();
        String dateStr1 = simpleDateFormat.format(date1);
        System.out.println("开始排序"+dateStr1);
        sort(array);
        Date date2 = new Date();
        String dateStr2 = simpleDateFormat.format(date2);
        System.out.println("排序结束"+dateStr2);
    }

    /**
     * 插入排序
     * @param arr 待排数据
     * @return 排序后的数组
     * 1.选择第一个数作为第一个有序数组的值
     * 2.其他数字为无序数组的值
     * 3.将无需数组的值在有序数组中找到待插入位置
     * 4.将该数据插入
     * 时间复杂度O(n^2)
     */
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];//从第二个数字作为待排数字
            int index = i - 1;//待排数字前数字的下标
            while (index >= 0 && arr[index] > value){
                //之前的数字大于待排数字
                //将待排数据加入数组前
                arr[index + 1] = arr[index];
                index--;//向前一步检查两个值的大小
            }
            arr[index + 1] = value;//还原数组值
        }
        return arr;
    }
}
