package javaPro;

import java.util.Scanner;

public class JavaPack {
	// ��ʾ��ʾ��Ϣ�ķ���
	public int notice() {
		System.out.println("********************************");
		System.out.println("      1--��������");
		System.out.println("      2--��ʾ��������");
		System.out.println("      3--��ָ��λ�ò�������");
		System.out.println("      4--��ѯ�ܱ�3����������");
		System.out.println("      0--�˳�");
		System.out.println("********************************");
		System.out.println("��������Ӧ�����ֽ��в���");

		Scanner sc = new Scanner(System.in);
		int keyd = sc.nextInt();
		return keyd;// ����
	}

	// ��������
	public int[] insertData() {
		int i = 0;
		int[] arr1 = new int[10];

		for (; i < 9; i++) {
			System.out.println("�������" + (i + 1) + "������");
			Scanner sc = new Scanner(System.in);
			arr1[i] = sc.nextInt();
		}
		return arr1;// ���ؼ��������ֵ
	}

	// ��ʾ��������
	public void showData(int[] a, int length) {
		System.out.println("����Ԫ��Ϊ��");
		// ��ӡ����
		for (int i = 0; i < 9; i++) {
			System.out.println();
		}
		System.out.println();
	}

	// ��ָ��λ�ô���������
	public void insertAtArray(int[] a, int n, int k) {
		System.out.println("��������������λ��");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();// ��Ҫ�ڵڼ��������в�������
		System.out.println("����������");
		Scanner sc1 = new Scanner(System.in);
		n = 0;
		for (; (9 - n) >= k; n++) {
			a[(9 - n)] = a[(9 - n) - 1];// ���¶���k�Ժ������ֵ
		}
		a[k - 1] = sc.nextInt();// ����kλ�õ�����ֵ

		System.out.println("����Ԫ��Ϊ��");
		for (; n < 10; n++) {
			System.out.print(a[n] + " ");
		}
		System.out.println();
	}

	// ��ѯ�ܱ�3����������
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
		// �ж������������ֵ
		switch (hint) {
		case 1:
			arr2 = method.insertData();
			System.out.println("����Ԫ��Ϊ��");
			for (int i = 0; i < 9; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.println();

			hint = method.notice();// ���µ�����ʾ��Ϣ����
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
			System.out.println("�˳�����");
			System.exit(hint);
			break;
		}
	}
}
