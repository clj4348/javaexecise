package com.imooc.circus;

public class Monkey extends Animal implements IACT {
	//新增属性：品种
	private String breed;
	
	//获取父类值的方法
	public Monkey(String name,int age,String breed){
		super(name,age);
		this.setBreed(breed);
	}
	//get/set的方法
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//返回信息
	public String massage(){
		return "表演者：" + this.getName()+"\n年龄："+ this.getAge()+"岁\n品种："+ this.getBreed();
	}
	
	//重写父类的抽象love()
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢模仿人的动作表情");
	}
}
