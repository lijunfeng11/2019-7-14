package com.itheima_day03;

import java.util.Scanner;

/*
	ѭ��¼��ĳѧ����5�ſγ̵ĳɼ�������ƽ���֡�
	
	ƽ���� = �ܷ�  / �γ̸���
	
	���ĳ����¼��Ϊ������ֹͣ¼�벢��ʾ¼�����
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ͱ���, ��¼�ܷ�
		int sum = 0;

		boolean flag = true;// true : ¼��ĳɼ�������ȷ�� , false : ����¼�������������

		for (int i = 1; i <= 5; i++) { // i = 3
			System.out.println("�������" + i + "�ſγ̳ɼ�:");
			int score = sc.nextInt();

			if (score < 0 || score > 100) {
				flag = false;
				System.out.println("¼��ɼ�����!");
				break;
			}

			sum += score;
		}

		// if(flag == true){
		if (flag) {
			System.out.println("ƽ����Ϊ:" + sum / 5.0);
		}

	}

}
