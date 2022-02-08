//SmartPhone 클래스는 PDA를 상속받고,
//MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다.

class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface  {
	// MobilePhoneInterface
	@Override
	public void sendCall() {
		System.out.println("따르르르릉~~");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
		
	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
		
	}
	
	//추가 작성 메소드
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
	

}
