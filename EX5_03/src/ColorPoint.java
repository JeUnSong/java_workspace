
class ColorPoint extends Point { // Point를 상속 받는 ColorPoint 선언
	private String color; // 점의색
	public ColorPoint(int x, int y, String color) {
		super(x,y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}

}
