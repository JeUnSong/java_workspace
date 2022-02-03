
public class Assignment5_2 {
//1부터 100까지 3의 배수만 출력하기. continue사용
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i % 3 != 0) {
				continue;
			}else {
				System.out.println(i);
			}
		}

	}
}

