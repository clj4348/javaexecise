package com.imooc.user;
	
	public class UserManager {
		//�û���Ϣ��֤�ķ���
		public String checkUser(User one,User two){
			//�ж��û��Ƿ�Ϊ�գ��Ƿ�һ��
			if((one.getName() == null) && (one.getName() == null)){
				System.out.println("�û���Ϊ��");
			}else if(one.getName().equals(two.getName())){
				System.out.println("�û�����ȷ");
			}else{
				System.out.println("�û�������");
			}
			//�ж��û������Ƿ�Ϊ�գ��Ƿ�һ��
			if((one.getPassword() == null) &&(two.getPassword() == null)){
				System.out.println("����Ϊ��");
			}else if(one.getPassword().equals(two.getPassword())){
				System.out.println("������ȷ");
			}else{
				System.out.println("�������");
			}
			return "";
		}
		
}
