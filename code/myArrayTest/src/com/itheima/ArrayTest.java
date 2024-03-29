package com.itheima;

import java.util.Scanner;

/*
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 * 分析：
 * 		A:定义一个长度为6的数组
 * 		B:评委打分的数据采用键盘录入实现
 * 		C:写代码获取数组的最大值(最高分)
 * 		D:写代码获取数组的最小值(最低分)
 * 		E:写代码求数组中的元素和(总分)
 * 		F:平均分：(总分-最高分-最低分)/(arr.length-2)
 * 		G:输出平均分即可
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 定义一个长度为6的数组
		int[] arr = new int[6];
		// 评委打分的数据采用键盘录入实现
		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < arr.length; x++) {
			System.out.println("请输入第" + (x + 1) + "个评委给出的分数：");
			int score = sc.nextInt();
			arr[x] = score;
		}
		// 写代码获取数组的最大值(最高分)
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		// 写代码获取数组的最小值(最低分)
		int min = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}

		// 写代码求数组中的元素和(总分)
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}

		// 平均分：(总分-最高分-最低分)/(arr.length-2)
		int avg = (sum - max - min) / (arr.length - 2);

		// 输出平均分即可
		System.out.println("该选手的最终得分是：" + avg);
	}
}
