//2. Point클래스를 인터페이스로 바꾸어서 코딩해보기
interface Pointxy {
	public abstract void showPoint();
}

class Point implements Pointxy {
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