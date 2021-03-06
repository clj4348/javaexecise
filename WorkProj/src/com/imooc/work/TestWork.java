package com.imooc.work;

public class TestWork extends Work {
	// 属性: 编写的测试用例个数、发现的Bug数量
	private int testNum;
	private int bugNum;

	// 编写构造方法，并调用父类相关赋值方法，完成属性赋值

	public TestWork(int testNum, int bugNum) {
		this.setTestNum(testNum);
		this.setBugNum(bugNum);
	}

	// 公有的get***/set***方法完成属性封装
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
	// 重写运行方法，描述内容为；

	public String work(){
		return "测试工作日报是：今天编写了"+this.getTestNum()+"个测试用例,发现了"+this.getBugNum()+"个bug";
	}
}
