package com.tsy;

/**
 * 找素数
 */
public class Test7_2 {
    public static void main(String[] args) {
        System.out.println("当前素数的个数是： " + search(101, 200));
    }

    public static int search(int start, int end) {
        int count = 0;
        //start = 101, end = 200
        OUT:
        //为外部循环指定标签
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue OUT;    //结束外部循环的当次执行
                }
            }
            System.out.println(i);
        }
        return count;
    }

}
