package sort;

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
        int[] arr = {2,32,13,12,412,123,12,41};
    }

    /**
     * 插入排序
     * @param arr 待排数据
     * @return 排序后的数组
     * 1.选择第一个数作为第一个有序数组的值
     * 2.其他数字为无序数组的值
     * 3.将无需数组的值在有序数组中找到待插入位置
     * 4.将该数据插入
     */
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];//从第二个数字作为待排数字
            int index = i - 1;//待排数字前数字的下标
        }
        return arr;
    }
}
