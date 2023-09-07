package kr.co.sist.course;

<<<<<<< HEAD
import javax.swing.JFrame;

//인영

@SuppressWarnings("serial")
public class EmployMainFrame extends JFrame {

	public EmployMainFrame() {
		super("메인");

		setBounds(400, 100, 1200, 800);
		setVisible(true);
		new EmployProfManageDialog(this);

		this.setResizable(false);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

=======
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EmployMainFrame extends EmpMainFrame {
	
	private JButton jbtnStuManage;
	private JButton jbtnProfesorManage;
	private JButton jbtnMajorManage;
	private JButton jbtnSubjectManage;
	private JLabel jlblEmpno;
	private JLabel jlblMyEmail;
	private JLabel jlblLoginTime;

	static EmployVO eVO;
	
	public EmployMainFrame() {
		//메인 버튼
		flow.setVgap(40);
		Dimension d = new Dimension(300, 50);
		
		jbtnStuManage = new JButton("학생관리");
		jbtnStuManage.setPreferredSize(d);
		jbtnProfesorManage = new JButton("교수관리");
		jbtnProfesorManage.setPreferredSize(d);
		jbtnMajorManage = new JButton("학과관리");
		jbtnMajorManage.setPreferredSize(d);
		jbtnSubjectManage = new JButton("과목관리");
		jbtnSubjectManage.setPreferredSize(d);
		
		pnlButton.add(jbtnStuManage);
		pnlButton.add(jbtnProfesorManage);
		pnlButton.add(jbtnMajorManage);
		pnlButton.add(jbtnSubjectManage);
		
		//관리자 정보 표시창
		jlblEmpno = new JLabel("EMP000100");
		jlblEmpno.setBounds(100, 0, 200, 30);
		jlblMyEmail = new JLabel("test@gmail.com");
		jlblMyEmail.setBounds(100, jlblEmpno.getY()+35, 200, 30);
		jlblLoginTime = new JLabel();
		jlblLoginTime.setBounds(100, jlblMyEmail.getY()+35, 200, 30);
		
		pnlInfoTag.add(jlblEmpno);
		pnlInfoTag.add(jlblMyEmail);
		pnlInfoTag.add(jlblLoginTime);
		
		//이름, 내 정보 버튼, 로그아웃 버튼 창
		jlblMyName.setText("농담곰(관리자)");
		jlblMyName.setHorizontalAlignment(JLabel.CENTER);
		
		pnlName.add(jlblMyName);

		EmployMainEvt eme = new EmployMainEvt(this);
		jbtnStuManage.addActionListener(eme);
		jbtnProfesorManage.addActionListener(eme);
		jbtnMajorManage.addActionListener(eme);
		jbtnSubjectManage.addActionListener(eme);
		jbtnMyProfile.addActionListener(eme);
		jbtnLogout.addActionListener(eme);
		addWindowListener(eme);
		
	}
	
	public JPanel setInfoLable() {
		String[] strArr = {"사번", "이메일", "로그인 시간"};
		JLabel[] jl = new JLabel[strArr.length];
		Font font = new Font(null, Font.BOLD, 14);
		
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setSize(310, 140);
		
		for(int i = 0; i < jl.length; i++) {
			jl[i] = new JLabel(strArr[i]);
			jl[i].setBounds(10, 35*i, 80, 30);
			jl[i].setFont(font);
			
			pnl.add(jl[i]);
		}
		
		return pnl;
	}

	public JButton getJbtnStuManage() {
		return jbtnStuManage;
	}

	public JButton getJbtnProfesorManage() {
		return jbtnProfesorManage;
	}

	public JButton getJbtnMajorManage() {
		return jbtnMajorManage;
	}

	public JButton getJbtnSubjectManage() {
		return jbtnSubjectManage;
	}

	public JLabel getJlblMyName() {
		return jlblMyName;
	}

	public JLabel getJlblEmpno() {
		return jlblEmpno;
	}

	public JLabel getJlblMyEmail() {
		return jlblMyEmail;
	}

	public JLabel getJlblLoginTime() {
		return jlblLoginTime;
	}

	public static EmployVO geteVO() {
		return eVO;
	}
	
>>>>>>> branch 'main' of https://github.com/mark3lim/group_prj.git
	public static void main(String[] args) {
		new EmployMainFrame();
	}

}
