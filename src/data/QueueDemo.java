package data;

import java.util.Arrays;

/**
 * @Author: ruan
 * Date: 2021/7/12 17:18
 * @Description: 队列
 */
public class QueueDemo {



}
/**
 * 数组模拟队列
 */
class ArrayQueue{
    private int maxSize;//队列最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//数组队列

    //创建构造器
    public ArrayQueue(int size) {
        maxSize = size ;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }
    //队列相关方法
    //队列是否满
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    //队列是否为空
    public boolean isNull(){
        return front == rear;
    }
    //向队列里面添加数据
    public void addQueue(int num){
        //判断队列是否已满
        if (isFull()){
            System.out.println("队列满，无法添加");
            return;
        }else {
            rear++;
            arr[rear] = num;
        }
    }
    //弹出队列数据（出队列）
    public int popQueue(){
        //判罚是否为空
        if (isNull()){
            System.out.println("队列为空，无数据");
        }
        front++;
        return arr[front];
    }
    //展示队列数据
    public void showQueue(){
        if (isNull()){
            System.out.println("队列为空无数据");
        }else {
            System.out.println(Arrays.toString(arr));
        }
    }
    //展示队头数据
    public int getQueue(){
        if (isNull()){
            System.out.println("队列为空，无数据");
        }
        return arr[front++];
    }
}
