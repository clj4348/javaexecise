package com.imooc.work;

public class Work {
	//属性:工作类型
	private String type;
	private int testNum;
	private int bugNum;
	//无参构造方法，完成工作类型的赋值
	public Work(){
		
	}
	//公有的get/set方法完成属性封装
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
	//方法：工作描述，描述内容为：开心工作
	public String work(){
		return "开心工作";
	}
	
}
