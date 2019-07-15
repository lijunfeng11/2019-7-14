package com.itheima_day03;

import java.util.Scanner;

/*
 	从键盘上录入一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
		1.数字的个位数不为7;
		2.数字的十位数不为5;
		3.数字的百位数不为3;
		
		
	 100 - 123
 */
public class Test2 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个大于100的数据:");
		int num = sc.nextInt();

		if (num < 100 || num > 999) {
			System.out.println("录入的数据不满足要求!");
		} else {
			for (int i = 100; i <= num; i++) {
				if (i % 10 != 7 && i / 10 % 10 != 5 && i / 10 / 10 % 10 != 3) {
					sum += i;
					System.out.println(i);
				}
			}

			System.out.println("满足要求的元素和为:" + sum);
		}

	}

}
