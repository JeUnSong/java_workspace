package Assignment6_1;

public class StudentApp {

	public static void main(String[] args) {
		Student name = new Student("송제운");
		Student korean = new Student("국어" + 80);
		Student english = new Student("영어" + 50);
		Student math = new Student("수학" + 30);
		System.out.println("제 이름은 " + name.name + "이며 저의 국어, 영어, 수학의 점수는 각각 ");
		System.out.println(korean.name + " " + english.name + " " + math.name + " 입니다.");

	}

}
