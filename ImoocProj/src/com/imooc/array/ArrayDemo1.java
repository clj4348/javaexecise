package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// ������������ۼӺ�
		// ������������
		/*int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		// �Ӽ��̽������ݣ�Ϊ����Ԫ�ظ�ֵ
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "Ԫ�أ�");
			a[i] = sc.nextInt();
		}
		System.out.println("����Ԫ�ص�����Ϊ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.print("ʹ����ǿ��forѭ������������ݣ�");
		for(int n:a){
			System.out.println(n+"  ");
		}
		//������Ԫ�ص��ۼӺ�
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		System.out.println();
		System.out.println("����Ԫ�ص��ۼӺ�Ϊ��" + sum);*/
		//����һ�����������е����Ͷ�ά����
		int[][] number = new int[3][2];
		String str = " ";
		Scanner sca = new Scanner(System.in);
		int chineseSum = 0;
		int chinesePass = 0;
		int mathSum = 0;
		int mathPass = 0;
		for(int i = 0;i<number.length;i++){
			for(int j =0;j<number[i].length;j++){
				if (j == 0) str = "����";
				if (j == 1) str = "��ѧ";
				System.out.println("�������" + (i + 1) + "ѧ����"+str+"�ɼ���");				
				number[i][j] = sca.nextInt();
			}
			chineseSum = chineseSum + number[i][0];
			chinesePass = chineseSum / (i + 1);
			mathSum = mathSum + number[i][1];
			mathPass = mathSum / (i + 1);
		}
		System.out.println("���ĳɼ����ܺ�" + chineseSum);
		System.out.println("���ĳɼ���ƽ����" + chinesePass);
		System.out.println("��ѧ�ɼ����ܺ�" + mathSum);
		System.out.println("��ѧ�ɼ���ƽ����" + mathPass);
	}
}
