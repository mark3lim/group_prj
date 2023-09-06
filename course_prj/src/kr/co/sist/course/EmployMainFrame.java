package kr.co.sist.course;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class EmployMainFrame extends EmpMainFrame {
	
	private JButton jbtnStuManage;
	private JButton jbtnProfesorManage;
	private JButton jbtnMajorManage;
	private JButton jbtnSubjectManage;
	private JButton jbtnMyInfo;
	private JButton jbtnLogout;
	private JLabel jlblMyName;
//	private JLabel jlblMyDept;
//	private JLabel jlblMyMajor;
	private JLabel jlblEmpno;
	private JLabel jlblMyEmail;
	private JLabel jlblLoginTime;

	static EmployVO eVO;
	
	public EmployMainFrame() {
		System.out.println("test");
		
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
		Font font = new Font("맑은 고딕", Font.BOLD, 16);
		
		jlblMyName = new JLabel("농담곰", JLabel.CENTER);
		jlblMyName.setBounds(0, 2, 80, 30);
		jlblMyName.setBorder(new LineBorder(Color.pink));
		jlblMyName.setFont(font);
		
		jbtnMyInfo = new JButton("내 정보");
		jbtnMyInfo.setBounds(90, 5, 85, 25);
		jbtnLogout = new JButton("로그아웃");
		jbtnLogout.setBounds(190, 5, 85, 25);
		
		pnlName.add(jlblMyName);
		pnlName.add(jbtnMyProfile);
		pnlName.add(jbtnLogout);
		
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

	public static void main(String[] args) {
		new EmployMainFrame();
	}

}
