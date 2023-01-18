package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	public int selectCheckLogin(Connection conn, String memberId, String memberPw) {
//		String query = "SELECT COUNT(*) AS M_COUNT FROM MEMBER_TBL WHERE MEMBER_ID = ? AND MEMBER_PW = ?";
		String query = "SELECT COUNT(*) FROM MEMBER_TBL WHERE MEMBER_ID = ? AND MEMBER_PW = ?";
		int result = -1;
		try {
			// 쿼리문 실행 준비
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPw);
			// 쿼리문 실행
			// 결과 받기
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
//				result = rset.getInt("M_COUNT");
				result = rset.getInt(1);
			}
			// 자원 해제
			pstmt.close();
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
