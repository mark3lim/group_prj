package kr.co.sist.course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployMainEvt extends WindowAdapter implements ActionListener {
	
	private EmployMainFrame emf;
	
	public EmployMainEvt(EmployMainFrame emf) {
		this.emf = emf;
	}
	
	public void goMyProfile() {
		System.out.println("profile");
	}
	
	public void goStuManage() {
		System.out.println("Student Manage");
	}
	
	public void goDrManage() {
		System.out.println("Dr Manage");
	}

	public void goMajorManage() {
		System.out.println("major Manage");
	}
	
	public void goLectureManage() {
		System.out.println("Lecture Manage");
	}
	
	public void setLoginTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String loginTime = sdf.format(new Date());
		
		emf.getJlblLoginTime().setText(loginTime);
	}
	
	public void initInfo() {
		System.out.println("Setting Info");
	}
	
	public void logout() {
		System.out.println("Logout");
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == emf.getJbtnMyProfile()) {
			goMyProfile();
		}
		if(ae.getSource() == emf.getJbtnLogout()) {
			logout();
		}
		if(ae.getSource() == emf.getJbtnStuManage()) {
			goStuManage();
		}
		if(ae.getSource() == emf.getJbtnProfesorManage()) {
			goDrManage();
		}
		if(ae.getSource() == emf.getJbtnMajorManage()) {
			goMajorManage();
		}
		if(ae.getSource() == emf.getJbtnSubjectManage()) {
			goLectureManage();
		}
	}

	@Override
	public void windowClosing(WindowEvent we) {
		emf.dispose();
	}

}
