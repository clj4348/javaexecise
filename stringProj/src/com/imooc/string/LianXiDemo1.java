package com.imooc.string;

public class LianXiDemo1 {
	public static void main(String[] args){
		//����һ���ַ���"��ӭ����"
		StringBuilder s =new StringBuilder("��ӭ����");
		//��"��ӭ����"�����������ݣ����ַ������"��ӭ����imooc"
		s.append("imooc");
		System.out.println(s);
		
		//ʹ��delete����ɾ��"��ӭ����",Ȼ����롰��ã���
		//���ַ�����ɡ���ã�imooc��
		//s.delete(0, 4).insert(0,"���!");
		//System.out.println(s);
		
		//ʹ��replace�����滻
		s.replace(0, 4,"���!");
		System.out.println(s);
	}
}