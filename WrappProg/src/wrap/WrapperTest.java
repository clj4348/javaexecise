package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		// ��Ϊ�µĶ�������Ϊfalse
		System.out.println("one==two�Ľ����" + (one == two));

		Integer three = 100;// �Զ�װ��
		// ��ʽ�ĵ��� Integer three = Integer.valueOf(100);
		// ��������ֵ���бȽ�����Ϊtrue
		System.out.println("three==100�Ľ����" + (three == 100));// �Զ�����

		Integer four = 100;
		System.out.println("three==four�Ľ����" + (three == four));
		
		//���������������أ�û����-128<����<127֮�䣬ʵ����Integer,�еĻ�ֱ�Ӳ���
		Integer five = 200;
		System.out.println("five==200�Ľ����" + (five == 200));
		
		Integer six = 200;
		System.out.println("five==six�Ľ����"+(five == six));
	}

}
