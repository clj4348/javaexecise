package com.imooc.method;

public class MaxDemo {
	public void max(double a,double b){
		
	}
	// 求最大值得方法
	public void max(float a, float b) {
		float max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("两个数" + a + "和" + b + "的最大值为：" + max);
	}

	public void sumMarry(float sum){
		float sumMarry;
		if(sum < 100){
            sumMarry = sum;
        }else if(sum >=100 && sum<= 199){
            sumMarry = sum * 0.95f;
        }else{
            sumMarry = sum * 0.85f;
        }
        System.out.println("折后商品总价为：" + sumMarry);
    }

	public static void main(String[] args) {
		MaxDemo maxDemo = new MaxDemo();
		int a = 5, b = 3;
		maxDemo.max(a, b);
		float m = 5.6f, n = 8.9f;
		maxDemo.max(m, n);
		maxDemo.max(9.8f, 12.8f);
		maxDemo.max(1.2f, 3.4f);

		// 定义对象
		float sum;
		// 定义商品总价存放到变量中
		sum = 150;
		// 调用方法，输出折后商品总价
		maxDemo.sumMarry(sum);
	}

}
