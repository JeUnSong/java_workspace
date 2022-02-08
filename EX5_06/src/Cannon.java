
class Cannon extends Weapon {
	@Override
	protected int fire() { // 오버라이딩
		return 10; // 대포는 한 번에 10명을 살상
	}

}
