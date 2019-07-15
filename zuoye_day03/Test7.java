package com.itheima_day03;

import java.util.Scanner;

/*
 * 循环录入学员Java课程的成绩（学员数量由键盘录入），统计分数大于等于80分的学生的比例。
 * 
 * 大于等于80分的学生数量 / 总数
 */
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("录入学生的数量:");
		int num = sc.nextInt();

		int count = 0;// 大于等于80分的学生数量

		for (int i = 1; i <= num; i++) {
			System.out.println("录入第" + i + "个学员Java课程的成绩:");
			int score = sc.nextInt();

			if (score >= 80) {
				count++;
			}
		}

		System.out.println("大于等于80分的学生的比例为:" + count * 1.0 / num);
	}

}
