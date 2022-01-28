
public class Assignment4_2 {
//구구단을 종적으로 2단부터 9단까지 출력하기.
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + i*j);
				 System.out.print('\t');
			}
			System.out.println();
		}

	}

}