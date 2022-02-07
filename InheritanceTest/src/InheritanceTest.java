class Person{
	public String name;
	public void speack() {System.out.println("말하다");}
	public void eat() {System.out.println("먹다");}
	public void walk() {System.out.println("걷다");}
	public void sleep() {System.out.println("자다");}
}
class Student extends Person{
	public void study() {System.out.println("공부하다");}
}
class StudentWorker extends Student{
	public void work() {System.out.println("일하다");}
}
class Researcher extends Person{
	public void research() {System.out.println("연구하다");}
}
class Professor extends Researcher{
	public void teach() {System.out.println("가르치다");}
}


public class InheritanceTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="홍길동";
		System.out.println(p.name);
		
		Student s=new Student();
		s.name="이순신";
		System.out.println(s.name);
		s.eat();
		s.study();
		
		StudentWorker sw=new StudentWorker();
		sw.name="김신";
		System.out.println(sw.name);
		sw.work();
		sw.walk();
		
		Researcher r=new Researcher();
		r.name="김정수";
		System.out.println(r.name);
		r.research();
		r.sleep();
		
		Professor pf=new Professor();
		pf.name="X";
		pf.teach();

	}

}
