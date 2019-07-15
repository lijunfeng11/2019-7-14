package com.itheima_day03;

import java.util.Scanner;

/*
	循环录入某学生的5门课程的成绩并计算平均分。
	
	平均分 = 总分  / 课程个数
	
	如果某分数录入为负，则停止录入并提示录入错误。
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 定义求和变量, 记录总分
		int sum = 0;

		boolean flag = true;// true : 录入的成绩都是正确的 , false : 代表录入的数据有问题

		for (int i = 1; i <= 5; i++) { // i = 3
			System.out.println("请输入第" + i + "门课程成绩:");
			int score = sc.nextInt();

			if (score < 0 || score > 100) {
				flag = false;
				System.out.println("录入成绩有误!");
				break;
			}

			sum += score;
		}

		// if(flag == true){
		if (flag) {
			System.out.println("平均分为:" + sum / 5.0);
		}

	}

}
