package kr.co.sist.course;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LecturePlanProfEditDialog extends JDialog{
	private ProfSubjectManageDialog psmd;
	
	private JTextField jtfLectureName;
	private JTextField jtfLectureGoal;
	private JTextArea jtaLectureInfo;
	private JButton jbtnAdd;
	

	public LecturePlanProfEditDialog(ProfSubjectManageDialog psmd) {
		super(psmd, "강의계획서", true);
		this.psmd=psmd;
		
		//라벨
		JLabel jlblTitle = new JLabel("강의 계획서");
		JLabel jlblLectureName = new JLabel("과목명");
		JLabel jlblLectureGoal = new JLabel("학습목표");
		JLabel jlblLectureInfo = new JLabel("내용");
		
		//TextField
		jtfLectureName = new JTextField();
		jtfLectureGoal = new JTextField();
		
		//TextArea
		jtaLectureInfo = new JTextArea();
		
		//Button
		jbtnAdd = new JButton("확인");
	
		
		//배경색
		Color backgroundColor = Color.decode("#FCF7F5");
		
		//버튼색
        jbtnAdd.setBackground(new Color(0xE0E0E0));
				
		// getContentPane() 메서드를 사용하여 배경색 설정
        Container contentPane = getContentPane();
        contentPane.setBackground(backgroundColor);
		        
        setLayout(null);

        //Bounds	
        jlblTitle.setBounds(20, 10, 210, 50);
        jlblLectureName.setBounds(60, 70, 100, 30);
        jlblLectureGoal.setBounds(60, 110, 100, 30);
        jlblLectureInfo.setBounds(60, 150, 100, 30);
        jtfLectureName.setBounds(130, 76, 500, 23);
        jtfLectureGoal.setBounds(130, 115, 500, 23);
        jtaLectureInfo.setBounds(60, 180, 570, 200);
        jbtnAdd.setBounds(300, 400, 80, 30);
        
        //글꼴
   		Font font = new Font("Pretendard", Font.BOLD, 18);
        jlblTitle.setFont(new Font("Pretendard", Font.BOLD, 22));
        jlblLectureName.setFont(font);
        jlblLectureGoal.setFont(font);
        jlblLectureInfo.setFont(font);
        
        
        //add
   		add(jlblTitle);
        add(jlblLectureName);
        add(jlblLectureGoal);
        add(jlblLectureInfo);
        add(jtfLectureName);
        add(jtfLectureGoal);
        add(jtaLectureInfo);
        add(jbtnAdd);
        
		setBounds(550, 180, 700, 500);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
        
        
	}//LecturePlanProfEditDialog

	public ProfSubjectManageDialog getPsmd() {
		return psmd;
	}

	public JTextField getJtfLectureName() {
		return jtfLectureName;
	}

	public JTextField getJtfLectureGoal() {
		return jtfLectureGoal;
	}

	public JTextArea getJtaLectureInfo() {
		return jtaLectureInfo;
	}

	public JButton getJbtnAdd() {
		return jbtnAdd;
	}
	
		
}//class

