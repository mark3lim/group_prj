package kr.co.sist.course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

public class SubjectManageEvt extends WindowAdapter implements ActionListener, MouseListener{
	
	private SubjectManageDialog smd;
	
	public SubjectManageEvt(SubjectManageDialog smd) {
		this.smd=smd;
	}
	
	//조회 버튼이 클릭되었을 때
	public void jcbSearch() {
		
		SubjectManageDAO smDAO = SubjectManageDAO.getInstance();
		
		try {
			List<SubjectManageVO> list = smDAO.selectAllSubject("컴퓨터공학부", "컴퓨터과학과" );
			smd.getDtmSub().setRowCount(0);
			
			String[] rowData=null;
			int no=1;

			for(SubjectManageVO smVO : list) {
			 //1.검색된 행을 채울 1차원 배열 생성
	         rowData = new String[8];
	         //2.생성된 배열에 값을 설정
	         rowData[0] = String.valueOf(no++);
	         rowData[1] = smVO.getSubCode();
	         rowData[2] = smVO.getSubName();
	         rowData[3] = smVO.getDptName();
	         rowData[4] = smVO.getMajorName();
	         rowData[5] = smVO.geteName();
	         rowData[6] = String.valueOf(smVO.getCredit());
	         rowData[7] = String.valueOf(smVO.getSubType());
	         
	         //값을 가진 일차원 배열을 JTable에 설정하기 위해
	         //Model 객체를 사용 - addRow
	         smd.getDtmSub().addRow(rowData);
	       
			}//end for
			
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//jcbSearch
	
	
	public void searchDpt() {
		
	}
	
	//등록 버튼 클릭
	public void addDpt() {
		new SubjectEditManageDialog(smd);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == smd.getJbtnAdd()) {
			SubjectEditManageDialog semd = new SubjectEditManageDialog(smd);
		}//end if
		
		if(e.getSource() == smd.getJbtnSearch()) {
			jcbSearch();
		}//end if
		
	}//mouseClicked

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == smd.getJbtnAdd()) {
			addDpt();
		}//end if
		
		if(e.getSource() == smd.getJbtnSearch()) {
			jcbSearch();
		}//end if
		
	    
	}//actionPerformed
	
	
	@Override
	public void windowClosing(WindowEvent we) {
		smd.dispose();
	}//windowClosing

	
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
}//SubjectManageEvt
