package com.imooc.model;

public class Staff {
	// ��Ա���ԣ����ơ����š��Ա����䡢���š� ְ��
	private String staffName;
	private String staffNo;
	private String staffSex;
	private int staffAge;
	private String staffJob;
	private String staffDp;

	// �޲ι���
	public Staff() {

	}

	// ��ι��췽����ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Staff(String staffName, String staffNo, String staffSex, int staffAge, String staffDp, String staffJob) {
		this.setStaffName(staffName);
		this.setStaffNo(staffNo);
		this.setStaffSex(staffSex);
		this.setStaffAge(staffAge);
		this.setStaffDp(staffDp);
		this.setStaffJob(staffJob);
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffSex() {
		return staffSex;
	}

	public void setStaffSex(String staffSex) {
		if (staffSex.equals("��") || staffSex.equals("Ů")) {
			this.staffSex = staffSex;
		} else {
			this.staffSex = "��";
		}
	}

	public int getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(int staffAge) {
		if (staffAge < 18 || staffAge > 65) {
			this.staffAge = 18;
		} else {
			this.staffAge = staffAge;
		}

	}

	public String getStaffJob() {
		return staffJob;
	}

	public void setStaffJob(String staffJob) {
		this.staffJob = staffJob;
	}

	public String getStaffDp() {
		return staffDp;
	}

	public void setStaffDp(String staffDp) {
		this.staffDp = staffDp;
	}


	/**
	 * Ա����Ϣ�ķ���
	 * 
	 * @return ���ҽ��ܵ���Ϣ���������������š��Ա����䡢ְ��;
	 */
	public String introduction() {
		String str = "\n������" + this.getStaffName() + "\n���ţ�" + this.getStaffNo() + "\n�Ա�" + this.getStaffSex()
				+ "\n���䣺" + this.getStaffAge() + "\nְ��" + (this.getStaffDp() + this.getStaffJob());
		return str;
	}
}