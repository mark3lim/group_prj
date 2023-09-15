package kr.co.sist.course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.sist.dao.DbConn;

public class LecturePlanProfDAO {
	private static LecturePlanProfDAO lppDAO;
	
	public static LecturePlanProfDAO getInstance() {
		if(lppDAO == null) {
			lppDAO = new LecturePlanProfDAO();
		}//end if
		return lppDAO;
	}//getInstance
	
	public int updatePlanContents(LecturePlanProfVO lppVO) throws SQLException{
		int rowCnt=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		DbConn db=DbConn.getInstance();
		
		try {
			con=db.getConnection("192.168.10.142", "applepie", "mincho");	
			StringBuilder updatePlan=new StringBuilder();
			updatePlan
			.append("	update subject_plan			")
			.append("	set subgoal=? , subinfo=?	")
			.append("	where subcode=?				");
			 
			pstmt=con.prepareStatement(updatePlan.toString());
			
			pstmt.setString(1, lppVO.getSubName());
			pstmt.setString(2, lppVO.getSubGoal());
			pstmt.setString(3, lppVO.getLectureInfo());
			
			rowCnt=pstmt.executeUpdate();
			
		} finally {
			db.dbClose(null, pstmt, con);
		}//end finally
		return rowCnt;
	}//updatePlanContents
	
}//class
