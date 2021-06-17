package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @PackgeName: sort
 * @ClassName: BubbleSort
 * @Author: 小天才
 * Date: 2021/6/8 20:26
 * project name: Algorithm-Exercise
 * @Version: 0.0.1
 * @Description: 冒泡排序
 */




 
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("排序功能测试");
        int[] arr = {7,2,5,1,7,4,6,7,1};
        System.out.println("排序前"+Arrays.toString(arr));
        int[] sort = sort(arr);
        System.out.println("排序后"+Arrays.toString(sort));
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
     *
     * @param arr 待排序数组
     * @return 排序后的数组(从小到达)
     * 1.两个数比较，如果前面的数大于后面的数则交换
     * 时间复杂度O(n^2)
     */
    public static int[] sort(int[] arr){
        //创建辅助变量用于交换数据
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
