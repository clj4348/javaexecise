package com.imooc.tel;

//�ӿڷ������η���public Ĭ��
public interface INet{
	/*
	 * /�ӿ��г��󷽷����Բ�дabstract�ؼ��� //�������η�Ĭ��public
	 * ����ʵ�ֽӿ�ʱ����Ҫȥʵ�ֽӿ��е����г��󷽷���������Ҫ����������Ϊ������
	 */
	void network();
	
	// �ӿ��п��԰���������Ĭ��public static final
	int TEMP = 20;
	
	//default��Ĭ�Ϸ��� ���Դ������� jdk1.8�����ķ���
	//�����Ӱ�ʵ��������д��������ͨ���ӿڵ����õ���
	default void connection(){
		System.out.println("���ǽӿ��е�Ĭ������");
	}
	
	//static:��̬���� ���Դ�������
	//��������ʵ��������д������ͬ�ӿ�������
	static void stop(){
		System.out.println("���ǽӿ��еľ�̬����");
	}
}
