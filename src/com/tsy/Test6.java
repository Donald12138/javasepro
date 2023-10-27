package com.tsy;

import java.util.Random;
import java.util.Scanner;

/**
 * 抢红包
 */
public class Test6 {
    public static void main(String[] args) {
        int[] moneys = {9, 666, 188, 520, 9999};
        start(moneys);
    }

    private static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(5);
            temp = moneys[i];
            moneys[i] = moneys[index];
            moneys[index] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("请您输入任意内容抽奖： ");
            sc.next();
            System.out.println("恭喜您抽中了红包：" + moneys[i] + "元");
        }
    }
}
