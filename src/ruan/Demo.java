package ruan;

import java.util.Date;
import java.util.Random;

/**
 * @Author: ruan
 * Date: 2021/7/11 15:07
 * @Description: 排序性能测试
 */
public class Demo {
    public static void main(String[] args) {
        Test test = new Test();
        //创建数组
        int[] arr = new int[80000];
        //数组赋值
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(80000);
        }
        Date beginDate1 = new Date();
        test.quickSort(arr,0,arr.length - 1);
        Date endDate1 = new Date();
        long time1 = endDate1.getTime() - beginDate1.getTime();
        System.out.println("quickSort:" + time1);

        Date beginDate2 = new Date();
        test.selectSort(arr);
        Date endDate2 = new Date();
        long time2 = endDate2.getTime() - beginDate2.getTime();
        System.out.println("selectSort:" + time2);

        Date beginDate3 = new Date();
        test.BubbleSort(arr);
        Date endDate3 = new Date();
        long time3 = endDate3.getTime() - beginDate3.getTime();
        System.out.println("BubbleSort:" + time3);

    }
}
