package com.imooc.test;

import java.util.Scanner;

import com.imooc.circus.Bear;
import com.imooc.circus.Clown;
import com.imooc.circus.Loin;
import com.imooc.circus.Monkey;
import com.imooc.circus.Parrot;

public class CircusTest {
	// ��ʾ��Ϣ��ʾ����
	public void CirusInfo() {
		System.out.println("*********��ӭ����̫����Ϸ��********");
		System.out.println("*********  ��ѡ�������********");
		System.out.println("*********    1������        ********");
		System.out.println("*********    2��ʨ��        ********");
		System.out.println("*********    3������        ********");
		System.out.println("*********    4������        ********");
		System.out.println("*********    5��С��        ********");

	}
	
	public int point() {
		//������Ϣ
		System.out.println("*******  �Ƿ�����ۿ���1/0�� ********");
		//����
		Scanner sy = new Scanner(System.in);
		int keyd = sy.nextInt();
		//����keyd��ֵ
		return keyd;
	}
	//��ӭ�´ι��ٵķ���
	public void welcome(){
		System.out.println("********** ��ӭ�´ι��� *********");
	}
	//������ʾ
	public void wrong(){
		System.out.println("********** ������Ϣ����������������Ϣ *********");
	}
	public static void main(String[] args) {
		//newһ��ʵ��
		CircusTest cf = new CircusTest();
		//������ʾ��Ϣ��ʾ����
		cf.CirusInfo();
		Scanner sc = new Scanner(System.in);
		int hint = sc.nextInt();
		int keyd;//ȫ������
		switch (hint) {
		case 1:
			Bear be = new Bear("bill", 1);
			System.out.println(be.massage());
			be.connection("���Ż�����������ɡ����������");
			be.love();
			keyd = cf.point();
			//��������
			//����Ĵ��������Ƶ�����������ܷ�װ��main������Ȼ���ٵ���,
			if(keyd == 1){//�����ۿ�
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){//�������˳�����
				cf.welcome();
				System.exit(hint);
			}else{//����ѭ�����ж����ֵ�Ƿ��������������ִ���ˣ�
				cf.wrong();
				keyd = cf.point();
			}
		case 2:
			Loin lo = new Loin("Lain", 2, "��ʨ", "��ɫ");
			System.out.println(lo.massage());
			lo.connection("�ó����Ȧ");
			lo.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 3:
			Monkey mo = new Monkey("Tom", 1, "��˿��");
			System.out.println(mo.massage());
			mo.connection("����ֳ�����ľ��");
			mo.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 4:
			Parrot pa = new Parrot("Rose", 1, "ĵ������");
			System.out.println(pa.massage());
			pa.connection("����ֳ�����ľ��");
			pa.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 5:
			Clown cl = new Clown("kahle", 5);
			System.out.println(cl.massage());
			cl.dress();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
			break;
		}

	}
}
