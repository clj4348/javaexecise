package com.imooc.car;

public class Taxi extends Car{
	//˽�����ԣ�������˾(company)
	private String company;
	public Taxi(){
		
	}
	
	//���ø���Ĺ��췽����������Ը�ֵ
	
	//ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getCompany(){
		return company;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	//������������д��ride����������Ϊ��**���⳵��������**��˾�ġ�
	public ride(){
		
	}
	//��д����use����������Ϊ����������������������������Ҫ����֮һ
	public void use(){
		System.out.println("��������������������������Ҫ����֮һ");
	}
	//��дtoString����������ı�����ʽ��ͬ(���color,userName)
}