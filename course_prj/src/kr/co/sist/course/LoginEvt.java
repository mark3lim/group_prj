package kr.co.sist.course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginEvt extends WindowAdapter implements ActionListener {
	
	private LoginFrame lf;
	
	public LoginEvt(LoginFrame lf) {
		this.lf = lf;
	}
	
	public void accountCheck(String id, char[] pw) {
		System.out.println(isAdmin());
		System.out.println(id);
		System.out.println(pw);
		System.out.println("로그인");
	}
	
	public boolean isAdmin() {
		boolean flag = lf.getJcbChangeAdmin().isSelected();
		return flag;
	}
	
	public void idSave(String id) {
		System.out.println(id);
		
		if(lf.getJcbIdSave().isSelected()) {
			System.out.println("아이디 저장");
		} else {
			System.out.println("아이디 저장 안 함");
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//로그인 버튼 하나만 구분하여 작동
		if(ae.getSource() == lf.getJbtnLogin()) {
			accountCheck(lf.getJtfId().getText(), lf.getJpPw().getPassword());
		}
	}

	@Override
	public void windowClosing(WindowEvent we) {
		lf.dispose();
	}

}
