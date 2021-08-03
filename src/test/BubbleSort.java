package test;

/**
 * @Author: ruan
 * Date: 2021/8/3 21:31
 * @Description: 冒泡排序
 * 时间复杂度：O(n^2)
 * 算法思想：
 *  从第一个数字开始逐一与其他的数据进行比较
 *  若arr[i] > arr[i+1] 交换两个数字
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,5,1,5,6,2,6,7,545,465,45533,757,6,867,8,5,566,36};

    }

    public void sort(int[] arr){
        int temp = 0;
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
}
