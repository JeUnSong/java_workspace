
public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; // b는 private 로 컴파일 오류
		sample.c = 10;

	}

}
