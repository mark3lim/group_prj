package kr.co.sist.course;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class StudentMainFrame extends JFrame {
	
	private JButton jbtnMyProfile; 
	private JButton jbtnLogout;
	private JButton jbtnRegisterSubject;
	private JButton jbtnGradeSearch;
	private JButton jbtnCourseApply;
	private JLabel jlblMyPhoto;
	private JLabel jlblMyName;
	private JLabel jlblDept;
	private JLabel jlblMajor;
	private JLabel jlblEmail;
	private JLabel jlbleLoginTime;

	private static StudentVO sVO;
	
	public StudentMainFrame(StudentVO stuVO) {
		sVO = stuVO;
		
		jlblMyPhoto = new JLabel();
		jlblMyPhoto.setBounds(100, 100, 200, 250);
		jlblMyPhoto.setBorder(new LineBorder(Color.red));
		
		JPanel pnlImg = new JPanel();
		pnlImg.setBorder(new LineBorder(Color.BLUE));

		JPanel pnlButton = new JPanel();
		pnlButton.setBounds(500, 100, 400, 400);
		pnlButton.setBorder(new LineBorder(Color.red));
		
		pnlImg.add(jlblMyPhoto);
		pnlImg.add(pnlButton);
		
		pnlImg.setLayout(null);
		add(pnlImg);
		
		setBounds(200, 150, 1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentMainFrame(sVO);
	}

	public JButton getJbtnMyProfile() {
		return jbtnMyProfile;
	}

	public JButton getJbtnLogout() {
		return jbtnLogout;
	}

	public JButton getJbtnRegisterSubject() {
		return jbtnRegisterSubject;
	}

	public JButton getJbtnGradeSearch() {
		return jbtnGradeSearch;
	}

	public JButton getJbtnCourseApply() {
		return jbtnCourseApply;
	}

	public JLabel getJlblMyPhoto() {
		return jlblMyPhoto;
	}

	public JLabel getJlblMyName() {
		return jlblMyName;
	}

	public JLabel getJlblDept() {
		return jlblDept;
	}

	public JLabel getJlblMajor() {
		return jlblMajor;
	}

	public JLabel getJlblEmail() {
		return jlblEmail;
	}

	public JLabel getJlbleLoginTime() {
		return jlbleLoginTime;
	}

	public static StudentVO getsVO() {
		return sVO;
	}

}
