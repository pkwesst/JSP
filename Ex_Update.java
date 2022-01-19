import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Update {

	public static void main(String[] args) {

		// 반드시 무조건 실행되어야 하는 부분
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "hr";

			Connection conn = DriverManager.getConnection(url, user, pw);// 객체 생성

			String sql = "update member set pw = '117' where id = 'ppp' ";

			PreparedStatement psmt = conn.prepareStatement(sql);

			// executeUpdate() : 삽입, 삭제, 수정( 수행 이후 테이블의 값에 영향을 끼치는 것들)
			// ->실행에 성공하면 수행된 row의 수를 반환해 줌
			// executeQuery() : 조회(=select)(수행 이후 테이블의 값에 영향이 없는 것들)

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("update 성공");
			} else {
				System.out.println("update 실패");
			}
			
			if(psmt != null) {   //객체 역순으로 닫음
				psmt.close();
			}if(conn != null) {
				conn.close();
			}
			
		} catch (ClassNotFoundException e) {

			System.out.println("동적 로딩 오류");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("sql 오류");
			e.printStackTrace();
		}

	}

}
