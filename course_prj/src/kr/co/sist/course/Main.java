package kr.co.sist.course;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	public Main() {
		super("메인");
		
		setBounds(500,100,1000,700);
		setVisible(true);
		new EmployStuManageDialog(this);
		
		//임시 window closing
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main();
	}

}
