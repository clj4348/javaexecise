package com.imooc.test;

//import com.imooc.anonymous.Man;
import com.imooc.anonymous.Person;
//import com.imooc.anonymous.Woman;

public class PersonTest {
	// ���ݴ���Ĳ�ͬ���˵����ͣ����ö�Ӧ��read�ķ���
	// ����1:
	// public void getRead(Man man){
	// man.read();
	// }
	// public void getRead(Woman woman){
	// woman.read();
	// }

	// ����2��
	public void getRead(Person person) {
		person.read();
	}

	public static void main(String[] args) {
		PersonTest test = new PersonTest();
		// Man one = new Man();
		// Woman two = new Woman();
		// test.getRead(one);
		// test.getRead(two);
		
		//����3�������ڲ���
		/* 
		 * 1�������ڲ���û���������ơ�ʵ����������
		 * 2��������ļ��������ⲿ��$����.class
		 * 3���޷�ʹ��private��public��protected��abstract��static����
		 * 4����д���췽����������ӹ�������
		 * 5�����ܳ��־�̬��Ա
		 * 6�������ڲ������ʵ�ֽӿ�Ҳ���Լ̳и��࣬���ǲ��ɼ��
		 */
		test.getRead(new Person() {
			{
				//��������
			}
			//public static int age = 12;
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("����ϲ�����ƻ�����鼮");
			}
		});
		test.getRead(new Person(){
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("Ů��ϲ��������С˵");
			}
		});
	}
}
