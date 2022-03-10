import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			//oracle jdbc드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
			//Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// 연결
			System.out.println("연결완료");
			
			Statement stmt = conn.createStatement();
			
			//stmt.executeUpdate("insert into student values('1111111','홍길동','철학과')"); //영향을 받은 행의 수가 리턴됨
			                      //삽입
			//stmt.executeUpdate("update student set dept='전자공학' where id='1234567'"); 
			                      //변경
			stmt.executeUpdate("delete from student where id='1234567'");
			                      //삭제
			
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getString("dept"));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {}

	}

}
