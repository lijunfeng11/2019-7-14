package com.itheima_day03;

import java.util.Scanner;

/*
�밴����Ҫ���д����,��ӡ�˵�:
	1.�Ӽ�����¼��һ��1��5������;
	2.
		������Ϊ1ʱ��ӡ�˵�"�½�";
	  	������Ϊ2ʱ��ӡ�˵�"���ļ�";
	  	������Ϊ3ʱ��ӡ�˵�"����";
	  	������Ϊ4ʱ��ӡ�˵�"ˢ��";
	  	������Ϊ5ʱ��ӡ�˵�"�˳�",���˳�����;
	  	���д��������ֹjava��������: System.exit(0);

 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		w: while (true) {
			System.out.println("������һ������(1-5):");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("�½�");
				break;
			case 2:
				System.out.println("���ļ�");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("ˢ��");
				break;
			case 5:
				System.out.println("�˳�");
				break w;

			default:
				System.out.println("¼�����������!");
				break;
			}
		}
	}
}
