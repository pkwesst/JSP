import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_JDBC {

	public static void main(String[] args) {

		// JDBC 연결 순서 (4단계)
		// 선행작업 - ojdbc6.jar 프로젝트에 라이브러리로 추가하기

		// try -> 예외 처리를 진행해주는 문법
		// 실행 시 오류가 발생되면 catch문을 통해 오류를 잡아 낼 수 있음

		// 자바의 오류
		// 1. 컴파일 오류 : 문법적인 오류
		// 2. 런타임 오류 : 문법상으로는 오류가 나지 않지만 실행시 오류가 나는 것
		
		try {
			// 1. 연결 - JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 변수를 사용해 나의 DB url, id, pw 정리 후 사용
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw = "hr";

			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url, id, pw);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패...");
			}

			// 3. SQL문 작성/전송(PreparedStatement 객체)
			//"abc", "0101", "박서현", "00"
			String sql = "insert into member values('abc', '0101', '홍길동', 00)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int cnt = psmt.executeUpdate();
			
			System.out.println("cnt 확인 : "+ cnt);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 오류!");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("sql 오류!");
			e.printStackTrace();
		}

		// 4. 종료

	}

}
