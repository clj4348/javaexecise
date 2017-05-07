package com.imooc.flow1;

public class ContinueDmoe {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			// continue会跳出当前循环的语句，不会结束下面语句
			if (i % 2 == 0)
				continue;
			sum = sum + i;
		}
		System.out.println("sum=" + sum);

		int k = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (j % 2 == 0)
					continue;
				k = k + j;
			}
		}
		System.out.println("k=" + k);
	}
}
