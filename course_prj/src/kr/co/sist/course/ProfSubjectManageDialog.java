package kr.co.sist.course;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ProfSubjectManageDialog extends JDialog {
	private LectureManageProfEditEvt lmpeEvt;
	
	private JLabel jlblSmd;
	private JLabel jlBack;
	private JComboBox<String> jcbDpt;
	private DefaultComboBoxModel<String> dcbmDpt;
	private JButton jbtnSearch;
	private JTable jtLecture;

	public ProfSubjectManageDialog() {

		jlblSmd = new JLabel("과목관리");
		dcbmDpt = new DefaultComboBoxModel<String>();
		jcbDpt = new JComboBox<String>(dcbmDpt);
		jbtnSearch = new JButton("조회");
		jlBack = new JLabel(new ImageIcon("C:/Users/dltmd/Desktop/backgr.png"));

		// 테이블
		String[] columnNames = { "No", "과목코드", "과목명", "학부명", "학과명", 
				"교수명", "학점", "이수구분", "강의계획서" };
		DefaultTableModel dtmSub = new DefaultTableModel(null, columnNames);
		jtLecture = new JTable(dtmSub);
		JScrollPane jspJtSub = new JScrollPane(jtLecture);

		// 행크기 변경 - setRowHeight
		jtLecture.setRowHeight(25);
		jtLecture.getColumnModel().getColumn(0).setPreferredWidth(30);
		jtLecture.getColumnModel().getColumn(1).setPreferredWidth(60);
		jtLecture.getColumnModel().getColumn(5).setPreferredWidth(30);

		// 학부 콤보박스
		dcbmDpt.addElement("컴퓨터공학부");
		dcbmDpt.addElement("인문사회부");
		dcbmDpt.addElement("연극학부");
		dcbmDpt.addElement("건축학부");
		dcbmDpt.addElement("체육학부");

		setLayout(null);

		// setBounds
		jlBack.setBounds(0, 0, 1000, 700);
		jlblSmd.setBounds(115, 65, 210, 50);
		jcbDpt.setBounds(110, 118, 125, 30);
		jbtnSearch.setBounds(245, 118, 60, 30);
		jspJtSub.setBounds(110, 170, 770, 355);

		//Font
		Font font = new Font("Pretendard", Font.BOLD, 14);
		jlblSmd.setFont(new Font("Pretendard", Font.BOLD, 20));
		jcbDpt.setFont(font);
		jbtnSearch.setFont(font);
		jtLecture.setFont(font);

		// setBackground
		jcbDpt.setBackground(new Color(0xE0E0E0));
		jbtnSearch.setBackground(new Color(0xE0E0E0));
		jbtnSearch.setBorder(null);
		
		//event
		lmpeEvt=new LectureManageProfEditEvt(this);
		jbtnSearch.addActionListener(lmpeEvt);
		
		// add
		add(jcbDpt);
		add(jbtnSearch);
		add(jlblSmd);
		add(jspJtSub);

		// 배경
		add(jlBack);

		setBounds(500, 150, 1000, 700);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// SubjectManageDialog

	public JLabel getJlblSmd() {
		return jlblSmd;
	}

	public JLabel getJlBack() {
		return jlBack;
	}

	public JComboBox<String> getJcbDpt() {
		return jcbDpt;
	}

	public DefaultComboBoxModel<String> getDcbmDpt() {
		return dcbmDpt;
	}

	public JButton getJbtnSearch() {
		return jbtnSearch;
	}

	public JTable getJtLecture() {
		return jtLecture;
	}

	public static void main(String[] args) {
		new ProfSubjectManageDialog();
	}

}// class
