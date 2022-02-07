
public class CircleApp {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "도미노 피자"); // 객체 생성/ 반지름을 10으로,
												   // 이름을 "도미노 피자"로 초기화
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); // 객체 생성. 반지름을 1, 이름을 ""로 초기화
		donut.name = "크리스피 도넛"; // 이름변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		}
}
