
public class ClassTest {

	//static은 인스턴스를 생성하지 않고 실행메모리에 올려준다.
	public static void main(String[] args) {
		//Circle클래서의 인스턴스 생성
		Circle pizza = new Circle();
		pizza.name="도미노피자";//이름
		pizza.radius=20;     //반지름
		double area = pizza.getArea();     //면적구하기
		System.out.println(pizza.name+"의 면적은 "+area);
		
//		Circle pizzaNick=pizza;
//		System.out.println(pizzaNick.name);
//		System.out.println(pizza.name);
		
		Circle donut = new Circle();
		donut.name="크리스피 도넛";
		donut.radius=2;
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

		
		donut=pizza;
	}
	
	
	
}
