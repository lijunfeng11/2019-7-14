package com.itheima_day03;

import java.util.Scanner;

/*
 * ѭ��¼��ѧԱJava�γ̵ĳɼ���ѧԱ�����ɼ���¼�룩��ͳ�Ʒ������ڵ���80�ֵ�ѧ���ı�����
 * 
 * ���ڵ���80�ֵ�ѧ������ / ����
 */
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¼��ѧ��������:");
		int num = sc.nextInt();

		int count = 0;// ���ڵ���80�ֵ�ѧ������

		for (int i = 1; i <= num; i++) {
			System.out.println("¼���" + i + "��ѧԱJava�γ̵ĳɼ�:");
			int score = sc.nextInt();

			if (score >= 80) {
				count++;
			}
		}

		System.out.println("���ڵ���80�ֵ�ѧ���ı���Ϊ:" + count * 1.0 / num);
	}

}
