package Assignment7_2;
//2. 마우스 클래스를 생성하시오.
//왼쪽버튼, 오른쪽버튼, mouseMove()
public class Mouse {
	public String name;
	public void leftClick() {System.out.println("왼쪽클릭");}
	public void rightClick() {System.out.println("오른쪽클릭");}
	public void mouseMove() {System.out.println("마우스 이동");}
}
//3. 휠마우스 클래스를 마우스클래스를 상속받아서 생성하시오.
//스크롤휠 추가
class WheelMouse extends Mouse {
	public void wheelUp() {System.out.println("휠올리기");}
	public void wheelDown() {System.out.println("휠내리기");}
	public void wheelClick() {System.out.println("휠클릭");}
}
//4. 3버튼마우스 클래스를 휠마우스 클래스를 상속받아서 생성하시오.
//버튼이 하나 더 있습니다.
class ThreeButtonMouse extends WheelMouse {
	public void threeButtonClick() {System.out.println("세번째 버튼 누르기");}
}

class MouseInheritance {
	//5. 2~4번의 인스턴스를 생성하시오.
	public static void main(String[] args) {
		Mouse m=new Mouse();
		m.name="마우스";
		System.out.println(m.name);
		m.leftClick();
		m.rightClick();
		m.mouseMove();
		
		WheelMouse wm=new WheelMouse();
		wm.name="휠마우스";
		System.out.println(wm.name);
		wm.wheelUp();
		wm.wheelDown();
		wm.wheelClick();
		
		ThreeButtonMouse tm=new ThreeButtonMouse();
		tm.name="3버튼마우스";
		System.out.println(tm.name);
		tm.threeButtonClick();
		
	}
}