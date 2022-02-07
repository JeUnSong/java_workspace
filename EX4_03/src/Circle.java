
public class Circle {
	int radius;
	String name;
	
	public Circle() { // 매개 변수 없는 생성자
		radius = 1; name = ""; // 필드 초기화
	}
	
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; name = n; //매개 변수로 필드 초기화
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}

}
