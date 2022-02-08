
public class GoodCalc extends Calculator {
	@Override
	public int add(int a, int b) { // 추상 메소드 구현
		return a + b;
	}
	@Override
	public int subtaract(int a, int b) { // 추상 메소드 구현
		return a - b;
	}
	@Override
	public double average(int[] a) { // 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
	}

public static void main(String[] args) {
	GoodCalc c = new GoodCalc();
	System.out.println(c.add(2, 3));
	System.out.println(c.subtaract(2, 3));
	System.out.println(c.average(new int [] {2,3,4}));
	
	//new Calculator(); // Calculator는 추상클래스이므로 인스턴스 생성 불가.
}
	
}