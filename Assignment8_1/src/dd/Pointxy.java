package dd;
//1. P253의 예제5-1에서 Point클래스의 showPoint()를 추상메서드로 변경해서
//Point클래스를 추상클래스로 바꾸어서 코딩해보기
abstract class Pointxy {
	public abstract void showPoint();
}

class Point extends Pointxy {
	private int x,y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color; 
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
