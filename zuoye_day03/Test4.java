package com.itheima_day03;

/*
 	分析以下需求，并用代码实现：while
		1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
		2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
public class Test4 {
	public static void main(String[] args) {
		double height = 0.0001;// 纸的高度
		int count = 0;// 记录纸折叠的次数

		while (true) {
			if (height < 8848) {
				height *= 2;// height = height * 2;
				count++;
				System.out.println("第"+count+"次折叠后纸的高度为:"+height);
			} else {
				break;
			}
		}

		System.out.println("折叠的次数为:" + count);
		
//		double height = 0.0001;// 纸的高度
//		int count = 0;// 记录纸折叠的次数
//
//		while (height < 8848) {
//			height *= 2;// height = height * 2;
//			count++;
//		}
//
//		System.out.println("折叠的次数为:" + count);
		
		
//		int count = 0;// 记录纸折叠的次数
//		for(double height = 0.0001; height < 8848 ; height*=2){
//			count++;
//		}
//		
//		System.out.println("折叠的次数为:" + count);
		
	}

}
