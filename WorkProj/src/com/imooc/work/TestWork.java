package com.imooc.work;

public class TestWork extends Work {
	// ����: ��д�Ĳ����������������ֵ�Bug����
	private int testNum;
	private int bugNum;

	// ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ

	public TestWork(int testNum, int bugNum) {
		this.setTestNum(testNum);
		this.setBugNum(bugNum);
	}

	// ���е�get***/set***����������Է�װ
	public int getTestNum() {
		return testNum;
	}

	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}

	public int getBugNum() {
		return bugNum;
	}

	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	// ��д���з�������������Ϊ��

	public String work(){
		return "���Թ����ձ��ǣ������д��"+this.getTestNum()+"����������,������"+this.getBugNum()+"��bug";
	}
}