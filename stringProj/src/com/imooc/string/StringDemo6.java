package com.imooc.string;

public class StringDemo6 {

	public static void main(String[] args) {
		// String�Ĳ��ɱ���
		// String����һ��������,�����޸�,�ǲ��ɱ��
		// ��ν���޸���ʵ�Ǵ����µĶ�����ָ����ڴ�ռ䲻��
		String s1 = "imooc";
		String s2 = "hello," + s1;
		// s1����ָ��imooc���ڵ��ڴ�ռ䣬����ָ����"hello,imooc"
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

		String s3 = new String("hello,imooc!");
		System.out.println("�Ӵ���" + s3.substring(0, 5));
		System.out.println("s3=" + s3);
	}

}