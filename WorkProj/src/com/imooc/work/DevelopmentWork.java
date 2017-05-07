package com.imooc.work;

public class DevelopmentWork extends Work{
	//属性：有效编码行数、目前没有解决的Bug个数
	private int codeNum;
	private int bugNum;
	// 编写构造方法，并调用父类相关赋值方法，完成属性赋值

		public DevelopmentWork(int codeNum, int bugNum) {
			this.setTestNum(codeNum);
			this.setBugNum(bugNum);
		}

		// 公有的get***/set***方法完成属性封装
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
		// 重写运行方法，描述内容为；

		public String work(){
			return "测试工作日报是：今天编写了"+this.getTestNum()+"个测试用例,发现了"+this.getBugNum()+"个bug";
		}
}

