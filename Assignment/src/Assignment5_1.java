
public class Assignment5_1 {
//1. 1부터 100까지 홀수만 출력하기. continue사용
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%2 == 0) {
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}
