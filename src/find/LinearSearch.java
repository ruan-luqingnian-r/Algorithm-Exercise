package find;

/**
 * @Author: ruan
 * Date: 2021/8/4 21:04
 * @Description: 线性查找，一个一个查找
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 8, 36, 465, 545, 566, 757, 867, 45533};
        System.out.println(find(arr,46));
    }

    public static int find(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
               return i;
            }
        }
        return -1;
    }

}
