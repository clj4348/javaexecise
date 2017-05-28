package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer one = new Integer(100);
		Integer two = new Integer(100);
		// 因为新的对象所以为false
		System.out.println("one==two的结果：" + (one == two));

		Integer three = 100;// 自动装箱
		// 隐式的调用 Integer three = Integer.valueOf(100);
		// 两个整数值进行比较所以为true
		System.out.println("three==100的结果：" + (three == 100));// 自动拆箱

		Integer four = 100;
		System.out.println("three==four的结果：" + (three == four));
		
		//如果缓存区（对象池）没有在-128<参数<127之间，实例化Integer,有的话直接产生
		Integer five = 200;
		System.out.println("five==200的结果：" + (five == 200));
		
		Integer six = 200;
		System.out.println("five==six的结果："+(five == six));
	}

}
