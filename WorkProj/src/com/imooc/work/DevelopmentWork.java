package com.imooc.work;

public class DevelopmentWork extends Work{
	//���ԣ���Ч����������Ŀǰû�н����Bug����
	private int codeNum;
	private int bugNum;
	// ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ

		public DevelopmentWork(int codeNum, int bugNum) {
			this.setTestNum(codeNum);
			this.setBugNum(bugNum);
		}

		// ���е�get***/set***����������Է�װ
		public int getCodeNum() {
			return codeNum;
		}

		public void setCodeNum(int codeNum) {
			this.codeNum = codeNum;
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

