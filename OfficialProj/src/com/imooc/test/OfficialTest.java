package com.imooc.test;

import com.imooc.model.Staff;

//import com.imooc.model.Job;
public class OfficialTest {
	public static void main(String[] args) {

		int[] arrAge = { 29, 21, 29, 100, 37, 24, };// 年龄
		// 工人的信息
		String[][] arr = { { "张明", "S001", "1234", "人事部", "经理" }, { "李艾爱", "S002", "女 ", "人事部", "助理" },
				{ "孙超", "S004", "男 ", "人事部", "职员" }, { "张美美", "S005", "女", "市场部", "职员" },
				{ "蓝迪", "S006", "男", "市场部", "经理" }, { "米莉", "S007", "女", "市场部", "职员" } };
		int count = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			Staff sta = new Staff(arr[i][0], arr[i][1], arr[i][2], arrAge[i], arr[i][3], arr[i][4]);
			System.out.println(sta.introduction());
			System.out.println("============================");
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == "人事部") {
					count++;
				}
				if (arr[i][j] == "市场部") {
					count2++;
				}
			}
		}
		System.out.println("人事部共有" + count + "名员工");
		System.out.println("市场部共有" + count2 + "名员工");
	}
}
