package com.imooc.circus;

public interface IACT {
	//�ӿ�Ĭ�Ϸ���
	default void connection(String skill){
		System.out.println("���ܣ�"+skill);
	}
}
