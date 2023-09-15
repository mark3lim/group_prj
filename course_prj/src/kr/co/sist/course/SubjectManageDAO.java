package kr.co.sist.course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConn;

public class SubjectManageDAO {
	private static SubjectManageDAO smDAO;

	public static SubjectManageDAO getInstance() {
		if (smDAO == null) {
			smDAO = new SubjectManageDAO();
		} // end if
		return smDAO;
	}// getInstance

	public List<SubjectManageVO> selectAllSubject(String dptname, String majorname) throws SQLException {
		List<SubjectManageVO> sas = new ArrayList<SubjectManageVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		DbConn db = DbConn.getInstance();

		try {
			// 1. 드라이버 로딩
			// 2. DB연결얻기
			con = db.getConnection("192.168.10.142", "applepie", "mincho");
			// 3. 쿼리문 생성객체 얻기
			StringBuilder selectAllSubject = new StringBuilder();
			selectAllSubject
			.append("  select s.subcode, s.subname, d.dptname, m.majorname, e.ename, s.credit, s.subtype 	")
			.append("  from subject s, major m, dpt d, emp e  																	")
			.append("  where s.dptcode=m.dptcode and m.dptcode=d.dptcode and e.dptcode=s.dptcode  		")
			.append("	and d.dptname=? and m.majorname=?	");
			pstmt = con.prepareStatement(selectAllSubject.toString());
			// 4. 바인드 변수 값 설정
			pstmt.setString(1, dptname);
			pstmt.setString(2, majorname);
			// 5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			SubjectManageVO smVO = null;

			while (rs.next()) {
				smVO = new SubjectManageVO(	
						rs.getString("subcode"), 
						rs.getString("subname"), 
						rs.getString("dptname"),
						rs.getString("majorname"),
						rs.getString("ename"), 
						rs.getInt("credit"),
						rs.getString("subtype").charAt(0));
				sas.add(smVO);
			} // end while

		} finally {
			// 6. 연결 끊기
			db.dbClose(rs, pstmt, con);
		}
		return sas;
	}// selectAllSubject

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
			String selectAllDpt = " select dptname from dpt ";
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
	
	public List<String> selectAllMajor(String dptname) throws SQLException {
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
			String selectAllMajor = " select m.majorname from dpt d, major m "
					+ "where d.dptcode=m.dptcode and d.dptname=? ";
			pstmt = con.prepareStatement(selectAllMajor);
			// 4.
			pstmt.setString(1, dptname);
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
	}// selectAllMajor

	public List<String> selectAllSub() throws SQLException {
		List<String> sublist = new ArrayList<String>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		DbConn db = DbConn.getInstance();

		try {
			// 1.
			// 2.
			con = db.getConnection("192.168.10.142", "applepie", "mincho");
			// 3.
			String selectAllSub = " select subcode, subname, credit, subtype from subject ";
			pstmt = con.prepareStatement(selectAllSub);
			// 4.
			// 5.
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sublist.add(rs.getString("subcode"));
				sublist.add(rs.getString("subname"));
				sublist.add(rs.getString("credit"));
				sublist.add(rs.getString("subtype"));
			} // end while

		} finally {
			// 6.
			db.dbClose(rs, pstmt, con);
		}
		return sublist;
	}// selectAllSub

	
	
	public List<SubjectManageVO> selectSub(String subcode, String subname) {
	    List<SubjectManageVO> subList = new ArrayList<>();

	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    DbConn db = DbConn.getInstance();

	    try {
	        // 드라이버 로딩
	        // DB 연결 얻기
	        con = db.getConnection("192.168.10.142", "applepie", "mincho");
	        // 쿼리문 생성 객체 얻기
	        StringBuilder selectSub = new StringBuilder();
	        selectSub
	                .append(" select subcode, subname 				")
	                .append(" from subject									")
	                .append(" where subcode=? and subname=? 	");
	        // 바인드 변수 값 설정
	        pstmt = con.prepareStatement(selectSub.toString());
	        pstmt.setString(1, subcode);
	        pstmt.setString(2, subname);
	        // 쿼리문 수행 후 결과 얻기
	        rs = pstmt.executeQuery();

	        while (rs.next()) {
	            SubjectManageVO smVO = new SubjectManageVO();
	            smVO.setSubCode(rs.getString(" subcode "));
	            smVO.setSubName(rs.getString(" subname "));
	            subList.add(smVO);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // 연결 끊기
	        try {
				db.dbClose(rs, pstmt, con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    return subList;
	}//selectSub
		
		
		
	public void insertSub(SubjectManageVO smVO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		DbConn db = DbConn.getInstance();
		try {
			con = db.getConnection("192.168.10.142", "applepie", "mincho");
			String insertSub = "insert into subject (subcode, subname, credit, subtype, empno, majorcode, dptcode) values (?,?,?,?,?,?,?)";

			pstmt = con.prepareStatement(insertSub);

			pstmt.setString(1, smVO.getSubCode());
			pstmt.setString(2, smVO.getSubName());
			pstmt.setInt(3, smVO.getCredit());
			pstmt.setObject(4, smVO.getSubType());

			pstmt.executeUpdate();
		} finally {
			db.dbClose(null, pstmt, con);
		} // end finally
		
	}// insertSub

	public int updateSub(SubjectManageVO smVO) throws SQLException {
		int rowCnt=0;
		Connection con = null;
		PreparedStatement pstmt = null;
		DbConn db = DbConn.getInstance();

		try {
			con = db.getConnection("192.168.10.142", "applepie", "mincho");
			StringBuilder updateSub = new StringBuilder();
			updateSub
			.append(" update subject 		")
			.append(" set subname=? 		")
			.append(" where subcode=? 	");

			pstmt = con.prepareStatement(updateSub.toString());

			pstmt.setString(1, smVO.getSubName());
			pstmt.setString(2, smVO.getSubCode());

			rowCnt=pstmt.executeUpdate();

		} finally {
			db.dbClose(null, pstmt, con);
		} // end finally
		return rowCnt;
	}// updateSub

	public static void main(String[] args) throws SQLException {
//		System.out.println(getInstance().selectAllSubject());
//		System.out.println(getInstance().selectAllMajor());
//		System.out.println(getInstance().selectAllDpt());
//		System.out.println(getInstance().selectAllSub());
//		System.out.println(getInstance().selectSub("KOR001001", "현대문학사"));
		
	}// main

}// class
