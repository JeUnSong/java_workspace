import java.util.Scanner;

public class Assignment009 {

	public static void main(String[] args) {
//1. 주민등록번호(010101-123456)에서 생년월일을 추출하시오
		String residentRegistrationNumber = "010101-123456";
		StringBuffer rrn = new StringBuffer(residentRegistrationNumber);
		rrn.reverse(); 
		System.out.println(rrn.substring(7));
		
//2. 전화번호(010-1234-5678)에서 '-'을 제거하시오.
		//=>01012345678 로 변경하기.
		String  phoneNumber ="010-1234-5678";
		 String pn = phoneNumber;
		 String[] result = pn.split("-");
		 for(String s:result)
			 System.out.print(s);
		 System.out.println();
		 
//3. 상품코드(E20160001)에서 상품카테고리('E')를 추출하시오.
		 String productCode = "E20160001";
		 StringBuffer pc =new StringBuffer(productCode);
		 pc.reverse();
		 System.out.println(pc.substring(8));
		 
//4. 상품코드(E20160001)에서 년도('2016')를 추출하시오.
		 pc.reverse();
		 pc.delete(0,1);
		 pc.delete(4,8);
		 System.out.println(pc);
		 
//5. 주소록 csv데이터에서 데이터를 분리하시오.
//홍길동,010-1111-2222,hkd@hkd.com
		 String addressBook="홍길동,010-1111-2222,hkd@hkd.com";
			String[] result1=addressBook.split(",");
			for(String ab:result1) {
				System.out.println(ab);
			}
			
//6. csv데이터에 다음과 같은 학번이 저장되어 있을 때.
//EL201800001,CH201800021,EN12231
//EL-전자공학과
//CH-화학공학과
//EN-영어영문학과
//각 학번의 학과명을 출력하시오.
				
				String classNumber = "EL201800001,CH201800021,EN12231";
				String[] result2=classNumber.split(",");
				for(int i=0; i<result2.length; i++) {
					if(result2[i].contains("EL")) {
						System.out.println("전자공학과");
					}else if(result2[i].contains("CH")){
						System.out.println("화학공학과");
					}else {
						System.out.println("영어영문학과");
					}
					
				}
				
//7. 아이디에 !,@,#,$,%,^가 포함된 경우
//'아이디에 !,@,#,$,%,^가 포함되면 안됩니다.'
//메시지 출력하기. charAt()참고.
				
				Scanner scanner = new Scanner(System.in);
				
				
				System.out.println("아이디를 입력해 주세요 : ");
				String id = scanner.next();
				
				if(id.contains("!")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else if (id.contains("@")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else if (id.contains("#")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else if (id.contains("$")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else if (id.contains("%")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else if (id.contains("^")) {
					System.out.println("아이디에 !,@,#,$,%,^가 들어가면 안됩니다.");
				}else {
					System.out.println("확인되었습니다.");
				}

			}
	}


