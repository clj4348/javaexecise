package com.imooc.model;

/**
 * רҵ��
 * 
 * @author Administrator
 *
 */
public class Subject {
	// ��Ա���ԣ�ѧ�����ơ�ѧ�Ʊ�š�ѧ�����ޡ�����ѡ�޵�ѧ����Ϣ������ѡ�޵�ѧ������
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;

	// �޲ι��췽��
	public Subject() {

	}

	// ���ι��죬ʵ�ֶ�ѧ�����ơ���š�ѧ�����޸�ֵ
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		// this.subjectName = subjectName;
		// ����д����ȫ�Ի����һЩ
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}

	// ���ι��죬ʵ�ֶ�ȫ����ֵ
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		// this.subjectName = subjectName;
		// ����д����ȫ�Ի����һЩ
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public String getSubjectNo() {
		return this.subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// ����ѧ�����ޣ����Ʊ��� > 0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	/**
	 * ��ȡѡѡ��רҵ��ѧ����Ϣ �������ѧ����Ϣ������δ����ʼ�������ȳ�ʼ������200
	 * 
	 * @return
	 */
	public Student[] getMyStudents() {
		if (this.myStudents == null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * רҵ���ܵĵķ���
	 * 
	 * @return רҵ���ܵ������Ϣ���������ơ���š�����
	 */

	public String info() {
		String str = "רҵ��Ϣ���£�\nרҵ����" + this.getSubjectName() + "\nרҵ��ţ�" + this.getSubjectNo() + "\nѧ�����ޣ�"
				+ this.getSubjectLife() + "��";
		return str;
	}

	public void addStudent(Student stu) {
		/**
		 * 1����ѧ�����浽������ 2����ѧ���������浽studentNum
		 */
		// 1����ѧ�����浽������
		for (int i = 0; i < this.getMyStudents().length; i++) {
			// �����������±�λ��Ϊ��
			if (this.getMyStudents()[i] == null) {
				stu.setStudentSubject(this);
				this.getMyStudents()[i] = stu;
				// 2����ѧ���������浽studentNum
				this.studentNum = i + 1;
				return;
			}
		}

	}
}
