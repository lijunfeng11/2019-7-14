package com.itheima_day03;

/*
 	1.打印1到100之内的整数，但数字中包含9的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 3 4 5

 */
public class Test5 {
	public static void main(String[] args) {
		int count = 0; // 打印元素的个数
		for (int i = 1; i <= 100; i++) {
			if (i % 10 != 9 && i / 10 % 10 != 9) {// 19
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}

}
