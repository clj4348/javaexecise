package com.imooc.test;

import java.util.Scanner;

import com.imooc.circus.Bear;
import com.imooc.circus.Clown;
import com.imooc.circus.Loin;
import com.imooc.circus.Monkey;
import com.imooc.circus.Parrot;

public class CircusTest {
	// 显示信息提示方法
	public void CirusInfo() {
		System.out.println("*********欢迎来到太阳马戏团********");
		System.out.println("*********  请选择表演者********");
		System.out.println("*********    1、棕熊        ********");
		System.out.println("*********    2、狮子        ********");
		System.out.println("*********    3、猴子        ********");
		System.out.println("*********    4、鹦鹉        ********");
		System.out.println("*********    5、小丑        ********");

	}
	
	public int point() {
		//提醒信息
		System.out.println("*******  是否继续观看（1/0） ********");
		//键盘
		Scanner sy = new Scanner(System.in);
		int keyd = sy.nextInt();
		//返回keyd的值
		return keyd;
	}
	//欢迎下次光临的方法
	public void welcome(){
		System.out.println("********** 欢迎下次光临 *********");
	}
	//错误提示
	public void wrong(){
		System.out.println("********** 输入信息错误，请重新输入信息 *********");
	}
	public static void main(String[] args) {
		//new一个实例
		CircusTest cf = new CircusTest();
		//调用显示信息提示方法
		cf.CirusInfo();
		Scanner sc = new Scanner(System.in);
		int hint = sc.nextInt();
		int keyd;//全局类型
		switch (hint) {
		case 1:
			Bear be = new Bear("bill", 1);
			System.out.println(be.massage());
			be.connection("挽着花篮，打着雨伞，自立走秀");
			be.love();
			keyd = cf.point();
			//问题所在
			//这里的代码出现率频繁，怎样才能封装在main方法中然后再调用,
			if(keyd == 1){//继续观看
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){//这里是退出程序
				cf.welcome();
				System.exit(hint);
			}else{//不能循环的判断里的值是否符合条件就往下执行了，
				cf.wrong();
				keyd = cf.point();
			}
		case 2:
			Loin lo = new Loin("Lain", 2, "公狮", "灰色");
			System.out.println(lo.massage());
			lo.connection("擅长钻火圈");
			lo.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 3:
			Monkey mo = new Monkey("Tom", 1, "金丝猴");
			System.out.println(mo.massage());
			mo.connection("骑独轮车过独木桥");
			mo.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 4:
			Parrot pa = new Parrot("Rose", 1, "牡丹鹦鹉");
			System.out.println(pa.massage());
			pa.connection("骑独轮车过独木桥");
			pa.love();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
		case 5:
			Clown cl = new Clown("kahle", 5);
			System.out.println(cl.massage());
			cl.dress();
			keyd = cf.point();
			if(keyd == 1){
				cf.CirusInfo();
				hint = sc.nextInt();
			}else if(keyd == 0){
				cf.welcome();
				System.exit(hint);
			}else{
				cf.wrong();
				keyd = cf.point();
			}
			break;
		}

	}
}
