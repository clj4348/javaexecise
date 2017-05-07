package com.imooc.model;

public class Staff {
	// 成员属性：名称、工号、性别、年龄、部门、 职务
	private String staffName;
	private String staffNo;
	private String staffSex;
	private int staffAge;
	private String staffJob;
	private String staffDp;

	// 无参构造
	public Staff() {

	}

	// 多参构造方法，实现对全部属性的赋值
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
		if (staffSex.equals("男") || staffSex.equals("女")) {
			this.staffSex = staffSex;
		} else {
			this.staffSex = "男";
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
	 * 员工信息的方法
	 * 
	 * @return 自我介绍的信息，包括姓名、工号、性别、年龄、职务;
	 */
	public String introduction() {
		String str = "\n姓名：" + this.getStaffName() + "\n工号：" + this.getStaffNo() + "\n性别：" + this.getStaffSex()
				+ "\n年龄：" + this.getStaffAge() + "\n职务：" + (this.getStaffDp() + this.getStaffJob());
		return str;
	}
}