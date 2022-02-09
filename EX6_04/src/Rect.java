
public class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

public boolean equals(Object obj) { //사각형 면적 비교
	Rect p = (Rect)obj; // obj를 Rect로 다운 캐스팅
	if(width*height == p.width*p.height) return true;
	else return false;
   }
}
