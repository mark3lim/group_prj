package kr.co.sist.course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConn;

public class LectureEditManageDAO {
		private static LectureEditManageDAO lemDAO;

		public static LectureEditManageDAO getInstance() {
			if (lemDAO == null) {
				lemDAO = new LectureEditManageDAO();
			} // end if
			return lemDAO;
		}// getInstance
		
		public List<String> selectAllDpt() throws SQLException {
			List<String> sad = new ArrayList<String>();

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			DbConn db = DbConn.getInstance();

			try {
				// 1.
				// 2.
				con = db.getConnection("192.168.10.142", "applepie", "mincho");
				// 3.
				String selectAllDpt = "select dptname from dpt";
				pstmt = con.prepareStatement(selectAllDpt);
				// 4.
				// 5.
				rs = pstmt.executeQuery();
				while (rs.next()) {
					sad.add(rs.getString("dptname"));
				} // end while

			} finally {
				// 6.
				db.dbClose(rs, pstmt, con);
			}
			return sad;
		}// selectAllDpt
		
		
		public List<String> selectAllMajor() throws SQLException {
			List<String> sam = new ArrayList<String>();

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			DbConn db = DbConn.getInstance();

			try {
				// 1.
				// 2.
				con = db.getConnection("192.168.10.142", "applepie", "mincho");
				// 3.
				String selectAllMajor = "select majorname from major";
				pstmt = con.prepareStatement(selectAllMajor);
				// 4.
				// 5.
				rs = pstmt.executeQuery();
				while (rs.next()) {
					sam.add(rs.getString("majorname"));
				} // end while

			} finally {
				// 6.
				db.dbClose(rs, pstmt, con);
			}
			return sam;
		}//selectAllMajor
		
		public List<String> selectAllProf() throws SQLException {
			List<String> sap = new ArrayList<String>();

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			DbConn db = DbConn.getInstance();

			try {
				// 1.
				// 2.
				con = db.getConnection("192.168.10.142", "applepie", "mincho");
				// 3.
				String selectAllProf = "select ename from emp";
				pstmt = con.prepareStatement(selectAllProf);
				// 4.
				// 5.
				rs = pstmt.executeQuery();
				while (rs.next()) {
					sap.add(rs.getString("ename"));
				} // end while

			} finally {
				// 6.
				db.dbClose(rs, pstmt, con);
			}
			return sap;
		}//selectAllProf
		
		public void insertLecture(LectureEditManageVO lemVO) throws SQLException{
			Connection con=null;
			PreparedStatement pstmt=null;
			DbConn db=DbConn.getInstance();
			
			con = db.getConnection("192.168.10.142", "applepie", "mincho");
			String insertLec="";
			
		}
		
		public int updateLecture(LectureEditManageVO lemVO) throws SQLException{
			int rowCnt=0;
			Connection con = null;
			PreparedStatement pstmt = null;
			DbConn db = DbConn.getInstance();
			
			try {
				con = db.getConnection("192.168.10.142", "applepie", "mincho");
				StringBuilder updateLec = new StringBuilder();
				updateLec
				.append("")
				.append("")
				.append("");
				
				pstmt = con.prepareStatement(updateLec.toString());
				
//				pstmt.setString(1, lemVO);
//				pstmt.setString(2, lemVO);
				
				rowCnt=pstmt.executeUpdate();
			} finally {
				db.dbClose(null, pstmt, con);
			}//end finally
			return rowCnt;
		}//updateLecture
		
		
		public static void main(String[] args) throws SQLException {
			System.out.println(getInstance().selectAllDpt());
//			System.out.println(getInstance().selectAllMajor());
//			System.out.println(getInstance().selectAllProf());
			

		
	}// main
}//class
