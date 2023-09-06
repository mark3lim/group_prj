package kr.co.sist.course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentMainEvt extends WindowAdapter implements ActionListener {
	
	private StudentMainFrame smf;
	
	public StudentMainEvt(StudentMainFrame smf) {
		this.smf = smf;
	}
	
	public void logout() {
		System.out.println("logout");
	}
	
	public void myPage() {
		System.out.println("my Profile");
	}
	
	public void mySubject() {
		System.out.println("my subject");
	}
	
	public void courseApplication() {
		System.out.println("select course");
	}
	
	public void myGrade() {
		System.out.println("my grade");
	}
	
	public void setLoginTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String loginTime = sdf.format(new Date());
		
		smf.getJlblLoginTime().setText(loginTime);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == smf.getJbtnMyProfile()) {
			myPage();
		}
		if(ae.getSource() == smf.getJbtnLogout()) {
			logout();
		}
		if(ae.getSource() == smf.getJbtnRegisterSubject()) {
			mySubject();
		}
		if(ae.getSource() == smf.getJbtnGradeSearch()) {
			myGrade();
		}
		if(ae.getSource() == smf.getJbtnCourseApply()) {
			courseApplication();
		}
	}

	@Override
	public void windowClosing(WindowEvent we) {
		smf.dispose();
	}
	
}
