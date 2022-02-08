
public class Person {
	private int weight;     // private 접근 지정. Student 클래스에서 접근 불가
	int age;                // 디폴트 접근 지정. Student 클래스에서 접근 가능
	protected int height;   // protected 접근 지정. Student 클래스에서 접근 가능
	public String name;     // public 접근 지정. Student 클래스에서 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	}                                 // private 멤버인 weight를 접근하기 위한 get/set 메소드
	public int getWeight() {
		return weight;
	}

}
