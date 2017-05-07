package com.imooc.user;
	
	public class UserManager {
		//用户信息验证的方法
		public String checkUser(User one,User two){
			//判断用户是否为空，是否一致
			if((one.getName() == null) && (one.getName() == null)){
				System.out.println("用户名为空");
			}else if(one.getName().equals(two.getName())){
				System.out.println("用户名正确");
			}else{
				System.out.println("用户名错误");
			}
			//判断用户密码是否为空，是否一致
			if((one.getPassword() == null) &&(two.getPassword() == null)){
				System.out.println("密码为空");
			}else if(one.getPassword().equals(two.getPassword())){
				System.out.println("密码正确");
			}else{
				System.out.println("密码错误");
			}
			return "";
		}
		
}
