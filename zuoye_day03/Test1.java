package com.itheima_day03;

/*
 * ��1��100֮��ļ���3�ı�������5����������֮��.
 */
public class Test1 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println("����3�ı�������5����������֮��:" + sum);

	}

}
