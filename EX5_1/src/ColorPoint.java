
public class ColorPoint extends Point { // Point를 상속받은 ColorPoint 선은
	private String color; // 점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();
	}
}
