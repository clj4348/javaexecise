package com.imooc.work;

public class Work {
	//����:��������
	private String type;
	private int testNum;
	private int bugNum;
	//�޲ι��췽������ɹ������͵ĸ�ֵ
	public Work(){
		
	}
	//���е�get/set����������Է�װ
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public int getTestNum(){
		return testNum;
	}
	public void setTestNum(int testNum){
		this.testNum = testNum;
	}
	public int getBugNum(){
		return bugNum;
	}
	public void setBugNum(int bugNum){
		this.bugNum = bugNum;
	}
	//������������������������Ϊ�����Ĺ���
	public String work(){
		return "���Ĺ���";
	}
	
}
