package kr.co.sist.course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LectureManageProfEditEvt extends WindowAdapter implements ActionListener, MouseListener {
	
	private ProfSubjectManageDialog psmd;
	
	public LectureManageProfEditEvt(ProfSubjectManageDialog psmd) {
		this.psmd=psmd;
	}
	
	public void addPlan(LecturePlanProfVO lppVO) {
		
	}
	
	public void bringPlan(LecturePlanProfVO lppVO) {
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == psmd.getJbtnSearch()) {
			LecturePlanProfEditDialog lpped = new LecturePlanProfEditDialog(psmd);
		}//end if
	}//mouseClicked
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == psmd.getJbtnSearch()) {
			LecturePlanProfEditDialog lpped = new LecturePlanProfEditDialog(psmd);
		}
	}
	
	@Override
	public void windowClosing(WindowEvent we) {
		psmd.dispose();
	}//windowClosing
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
}
