package com.itheima_day03;

/*
 	�����������󣬲��ô���ʵ�֣�while
		1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
		2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 */
public class Test4 {
	public static void main(String[] args) {
		double height = 0.0001;// ֽ�ĸ߶�
		int count = 0;// ��¼ֽ�۵��Ĵ���

		while (true) {
			if (height < 8848) {
				height *= 2;// height = height * 2;
				count++;
				System.out.println("��"+count+"���۵���ֽ�ĸ߶�Ϊ:"+height);
			} else {
				break;
			}
		}

		System.out.println("�۵��Ĵ���Ϊ:" + count);
		
//		double height = 0.0001;// ֽ�ĸ߶�
//		int count = 0;// ��¼ֽ�۵��Ĵ���
//
//		while (height < 8848) {
//			height *= 2;// height = height * 2;
//			count++;
//		}
//
//		System.out.println("�۵��Ĵ���Ϊ:" + count);
		
		
//		int count = 0;// ��¼ֽ�۵��Ĵ���
//		for(double height = 0.0001; height < 8848 ; height*=2){
//			count++;
//		}
//		
//		System.out.println("�۵��Ĵ���Ϊ:" + count);
		
	}

}
