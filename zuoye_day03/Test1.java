package com.itheima_day03;

/*
 * 出1到100之间的既是3的倍数又是5倍数的数字之和.
 */
public class Test1 {
	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println("既是3的倍数又是5倍数的数字之和:" + sum);

	}

}
