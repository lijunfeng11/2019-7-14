package com.itheima_day03;

/*
 	1.��ӡ1��100֮�ڵ��������������а���9��Ҫ����
	2.ÿ�����5����������������֮���ÿո�ָ�
	3.�磺1 2 3 4 5

 */
public class Test5 {
	public static void main(String[] args) {
		int count = 0; // ��ӡԪ�صĸ���
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
