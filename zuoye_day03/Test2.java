package com.itheima_day03;

import java.util.Scanner;

/*
 	�Ӽ�����¼��һ������100����λ��,���100��������֮����������Ҫ�������֮��:
		1.���ֵĸ�λ����Ϊ7;
		2.���ֵ�ʮλ����Ϊ5;
		3.���ֵİ�λ����Ϊ3;
		
		
	 100 - 123
 */
public class Test2 {
	public static void main(String[] args) {
		// ������ͱ���
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("������һ������100������:");
		int num = sc.nextInt();

		if (num < 100 || num > 999) {
			System.out.println("¼������ݲ�����Ҫ��!");
		} else {
			for (int i = 100; i <= num; i++) {
				if (i % 10 != 7 && i / 10 % 10 != 5 && i / 10 / 10 % 10 != 3) {
					sum += i;
					System.out.println(i);
				}
			}

			System.out.println("����Ҫ���Ԫ�غ�Ϊ:" + sum);
		}

	}

}
