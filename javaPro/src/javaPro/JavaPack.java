package javaPro;

import java.util.Scanner;

public class JavaPack {
	// 显示提示信息的方法
	public int notice() {
		System.out.println("********************************");
		System.out.println("      1--插入数据");
		System.out.println("      2--显示所有数据");
		System.out.println("      3--在指定位置插入数据");
		System.out.println("      4--查询能被3整除的数据");
		System.out.println("      0--退出");
		System.out.println("********************************");
		System.out.println("请输入相应的数字进行操作");

		Scanner sc = new Scanner(System.in);
		int keyd = sc.nextInt();
		return keyd;// 返回
	}

	// 插入数据
	public int[] insertData() {
		int i = 0;
		int[] arr1 = new int[10];

		for (; i < 9; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据");
			Scanner sc = new Scanner(System.in);
			arr1[i] = sc.nextInt();
		}
		return arr1;// 返回键盘输入的值
	}

	// 显示所有数据
	public void showData(int[] a, int length) {
		System.out.println("数组元素为：");
		// 打印数组
		for (int i = 0; i < 9; i++) {
			System.out.println();
		}
		System.out.println();
	}

	// 在指定位置处插入数据
	public void insertAtArray(int[] a, int n, int k) {
		System.out.println("输入需插入数组的位置");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();// 需要在第几个数组中插入数据
		System.out.println("输入新数组");
		Scanner sc1 = new Scanner(System.in);
		n = 0;
		for (; (9 - n) >= k; n++) {
			a[(9 - n)] = a[(9 - n) - 1];// 重新定义k以后的数组值
		}
		a[k - 1] = sc.nextInt();// 赋予k位置的数组值

		System.out.println("数组元素为：");
		for (; n < 10; n++) {
			System.out.print(a[n] + " ");
		}
		System.out.println();
	}

	// 查询能被3整除的数据
	public void divThree(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		JavaPack method = new JavaPack();
		int[] arr2 = new int[10];
		int hint = method.notice();
		// 判读键盘输入的数值
		switch (hint) {
		case 1:
			arr2 = method.insertData();
			System.out.println("数组元素为：");
			for (int i = 0; i < 9; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.println();

			hint = method.notice();// 重新调用提示信息方法
		case 2:
			method.showData(arr2, 0);
			hint = method.notice();
		case 3:
			method.divThree(arr2);
			hint = method.notice();
		case 4:
			method.insertAtArray(arr2, 0, 0);
			hint = method.notice();
		case 0:
			System.out.println("退出程序！");
			System.exit(hint);
			break;
		}
	}
}
