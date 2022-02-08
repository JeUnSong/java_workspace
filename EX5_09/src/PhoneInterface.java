interface PhoneInterface {
	final int TIMEOUT = 10000; //상수 필드 선언
	void sendCall();		   //추상 메소드
	void receiveCall();		   //추상 메소드
	default void printLogo() { //default 메소드
		System.out.println("** Phone **");
	}

}
interface MobilePhoneInterface extends PhoneInterface { // 인터페이스 상속
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface { // 인터페이스 선언
	public void play();
	public void stop();
}
class PDA { // 클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}
