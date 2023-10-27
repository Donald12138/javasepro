package com.tsy;

import java.util.Random;
import java.util.Scanner;

/**
 * 完成双色球的开发
 */
public class Test8 {
    public static void main(String[] args) {
        //目标： 完成双色球系统的开发
        int[] userNumbers = userSelectNumber();
        System.out.println("您投注的号码：");
        printArray(userNumbers);

        int[] luckyNumbers = creatLuckyNumber();
        System.out.println("中奖的号码：");
        printArray(luckyNumbers);
        judge(userNumbers, luckyNumbers);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    /**
     * 1.设计一个方法，让用户输入一组号码并返回（6红1蓝）
     */
    public static int[] userSelectNumber() {
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //2.创建一个整型数组，用于存储用户投注的7个号码（6红1蓝）
        //3.遍历前6个位置，让用户投注6个红球，存入
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                //4.让用户为当前位置投注一个红球号码
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33）之间，不能重复");
                int number = sc.nextInt();
                //5.判断用户输入的红球号码是否在1-33之间
                if (number < 1 || number > 33) {
                    System.out.println("对不起，您输入的号码不在1-33之间，请确认");
                } else {
                    //判断是否重复
                    if (exist(numbers, number)) {
                        //重复了
                        System.out.println("对不起，您输入的红球号码重复了，请确认");
                    } else {
                        //number没有重复且符合条件
                        numbers[i] = number;
                        break;  //结束当次死循环
                    }
                }
            }
        }

        //6.投注一个蓝色号码
        while (true) {
            System.out.println("请输入最后一个蓝球号码（1-16）");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的蓝球号码范围不对");
            } else {
                numbers[6] = number;
                break;  //蓝球号码输入成功，跳出死循环
            }
        }
        return numbers;
    }

    private static boolean exist(int[] numbers, int number) {
        //需求：判断number这个数字是否在numbers数组中存在
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2.设计一个方法，随机一组中奖号码
     */
    public static int[] creatLuckyNumber() {
        //1.创建一个整型数组，同于存储7个号码
        int[] numbers = new int[7];
        Random r = new Random();

        //2.遍历前6个位置，依次随机一个红球号码存入（1-33）
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                //3.为当前位置随机一个红球号码存入
                int number = r.nextInt(33) + 1;

                //4.判断号码是否之前出现过
                if (exist(numbers, number)) {
                    //重复了
                } else {
                    //number不重复
                    numbers[i] = number;
                    break;  //结束死循环，找到该位置红球
                }
            }
        }
        //3.录入蓝球号码
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    /**
     * 设计一个方法，用于判断用户的中奖情况
     */
    public static void judge(int[] userNumbers, int[] luckyNumbers) {
        int redCount = 0;
        int blueCount = 0;
        //先判断红球命中的数量
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckyNumbers.length - 1; j++) {
                if (userNumbers[i] == luckyNumbers[j]) {
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球命中的数量
        blueCount = userNumbers[6] == luckyNumbers[6] ? 1 : 0;
        System.out.println("您命中的红球数量是： " + redCount);
        System.out.println("您命中的蓝球数量是： " + blueCount);

        //判断中奖详情，并输出结果
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜您，中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您，中奖3000元");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜您，中奖200元");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1) {
            System.out.println("恭喜您，中奖10元");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("恭喜您，中奖5元");
        } else {
            System.out.println("很遗憾，您没有中奖");
        }
    }
}
