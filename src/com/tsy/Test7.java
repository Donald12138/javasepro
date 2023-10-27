package com.tsy;

/**
 * 找素数
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println("当前素数的个数是： " + search(101, 200));
    }

    public static int search(int start, int end) {
        int count = 0;
        //start = 101, end = 200
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("xiugaiban");
        return count;
    }

}
