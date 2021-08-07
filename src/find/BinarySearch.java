package find;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ruan
 * Date: 2021/8/4 21:18
 * @Description: 二分查找
 * 从中间值开始，进行折半查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 8, 36, 465, 545, 566, 757, 867, 45533};
        List<Integer> list = binarySearch(arr, 5, 0, arr.length);
        System.out.println(list);

    }

    /**
     * 二分查找
     * @param arr 带查找数组
     * @param target 目标值
     * @param left 左索引
     * @param right 右索引
     * @return 数组的下标
     */
    //初级版本
    public static int find(int[] arr,int target,int left,int right){
        if (left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (target > midVal){
            //向右递归
            return find(arr, target, mid + 1, right);
        }
        if (target < midVal){
            return find(arr, target, left, mid - 1);
        }
        return mid;
    }
    //高级版
    public static List<Integer> binarySearch(int[] arr,int target,int left,int right){
        //如果left > right说明遍历结束未找到目标值
        if (left > right){
            return new ArrayList<Integer>();
        }
        //中值
        int mid = (right + left) / 2;
        int midVel = arr[mid];

        if (midVel > target){
            //向左递归
            return binarySearch(arr, target, left, mid - 1);

        }else if (midVel < target){
            //向右
            return binarySearch(arr, target, mid + 1, right);
        }else {
            //找到的值
            ArrayList<Integer> list = new ArrayList<>();
            list.add(mid);
            //找到值，但是继续向左右扫描
            //向左扫描
            int temp1 = mid - 1;
            while (true){
                //到最左边没找到则退出
                if (temp1 < left || arr[temp1] != target){
                    break;
                }
                list.add(temp1);
                temp1--;
            }
            //向右扫描
            int temp2 = mid + 1;
            while (true){
                if (temp2 > right || arr[temp2] != target){
                    break;
                }
                list.add(temp2);
                temp2++;
            }
            return list;
        }
    }
}
