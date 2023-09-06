package kr.co.sist.course;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
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
		
//		ImageIcon icon = new ImageIcon("C:/Users/user/git/group_prj/course_prj/src/kr/co/sist/course/images/bg.png");
		
//		JPanel pnlBg = new JPanel() {
//			public void paint(Graphics g) {//그리는 함수
//				Image img = new ImageIcon(Main.class.getResource("../images/bg.png")).getImage();
//				g.drawImage(img, 0, 0, null);//background를 그려줌		
//			}
//		};w
//		pnlBg.imag
//		pnlBg.setBorder(new LineBorder(Color.BLUE));

		JPanel pnlButton = new JPanel();
		pnlButton.setBounds(500, 100, 400, 400);
		pnlButton.setBorder(new LineBorder(Color.red));
		
		setLayout(null);
		
		add(jlblMyPhoto);
		add(pnlButton);
		
		
//		add(pnlBg);
		
		setBounds(200, 150, 1200, 800);
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
