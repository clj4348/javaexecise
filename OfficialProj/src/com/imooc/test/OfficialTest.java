package com.imooc.test;

import com.imooc.model.Staff;

//import com.imooc.model.Job;
public class OfficialTest {
	public static void main(String[] args) {

		int[] arrAge = { 29, 21, 29, 100, 37, 24, };// ����
		// ���˵���Ϣ
		String[][] arr = { { "����", "S001", "1234", "���²�", "����" }, { "���", "S002", "Ů ", "���²�", "����" },
				{ "�ﳬ", "S004", "�� ", "���²�", "ְԱ" }, { "������", "S005", "Ů", "�г���", "ְԱ" },
				{ "����", "S006", "��", "�г���", "����" }, { "����", "S007", "Ů", "�г���", "ְԱ" } };
		int count = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			Staff sta = new Staff(arr[i][0], arr[i][1], arr[i][2], arrAge[i], arr[i][3], arr[i][4]);
			System.out.println(sta.introduction());
			System.out.println("============================");
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == "���²�") {
					count++;
				}
				if (arr[i][j] == "�г���") {
					count2++;
				}
			}
		}
		System.out.println("���²�����" + count + "��Ա��");
		System.out.println("�г�������" + count2 + "��Ա��");
	}
}
