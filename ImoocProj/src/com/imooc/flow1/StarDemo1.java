package com.imooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;//��ѭ����ѭ������
		int n = 1;//��ѭ����ѭ������
		System.out.println("���4��4�е��Ǻ�");
		//����ѭ�������������
		while( m <= 8){
			//����ѭ������ÿ����������Ǻ�
			n=1;
			while( n <= m){
				System.out.print("*");
				System.out.print(" ");
				n++;
			}
			System.out.println(" ");
			m++;
		}
	}
} 
