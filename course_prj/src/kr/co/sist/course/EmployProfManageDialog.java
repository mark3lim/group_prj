package kr.co.sist.course;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class EmployProfManageDialog extends JDialog {

//	private Main main;

	public EmployProfManageDialog() {
//		super(main,"관리자",true);
//		this.main=main;

		// 타이틀
		JLabel jlblTitle = new JLabel("교수관리");
		// 배경
		JLabel jlblback = new JLabel(
				new ImageIcon("E:/dev/workspace/html_prj/src/main/webapp/common/images/backgr.png"));

		DefaultComboBoxModel<String> dcbmSearch = new DefaultComboBoxModel<String>();
		JComboBox<String> jcbSearch = new JComboBox<String>(dcbmSearch);

		dcbmSearch.addElement("사번");
		dcbmSearch.addElement("이름");

		// 검색창
		JTextField jtfSearch = new JTextField();
		// 등록버튼
		JButton jbtnAdd = new JButton("등록");
		// 조회버튼
		JButton jbtnSearch = new JButton("조회");
		// 테이블
		String[] columNames = { "No", "사번", "이름", "학부명", "학과명", "전화번호", "이메일" };
		DefaultTableModel dtmProf = new DefaultTableModel(null, columNames);
		JTable jtProf = new JTable(dtmProf);
		JScrollPane jspJtProf=new JScrollPane(jtProf); 

		// Bounds
		jlblback.setBounds(0, 0, 1000, 700);
		jlblTitle.setBounds(115, 65, 210, 50);
		jcbSearch.setBounds(555, 80, 100, 30);
		jtfSearch.setBounds(665, 80, 140, 30);
		jbtnSearch.setBounds(815, 80, 60, 30);
		jbtnAdd.setBounds(795, 540, 80, 30);
		jspJtProf.setBounds(110, 170, 770, 350);

		// Font
		Font font = new Font("Pretendard", Font.BOLD, 14);
		jlblTitle.setFont(new Font("Pretendard", Font.BOLD, 20));
		jcbSearch.setFont(font);
		jtfSearch.setFont(font);
		jbtnSearch.setFont(font);
		jbtnAdd.setFont(font);
		jspJtProf.setFont(font);
		

		// back-color
//		jcbSearch.setBackground(new Color(0xE0E0E0));
		jbtnSearch.setBackground(new Color(0xE0E0E0));
		jbtnAdd.setBackground(new Color(0xE0E0E0));
		jtfSearch.setBorder(new LineBorder(new Color(0xE0E0E0)));
		jbtnSearch.setBorder(null);
		jbtnAdd.setBorder(null);

		// add
		add(jlblTitle);
//		add(jtProf);
		add(jbtnSearch);
		add(jbtnAdd);
		add(jtfSearch);
		add(jcbSearch);
		add(jspJtProf);

		// add background
		add(jlblback);

		setLayout(null);
		setResizable(false);

		setBounds(500, 100, 1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}// EmployProfManageDialog

	public static void main(String[] args) {
		new EmployProfManageDialog();
	}// mian

}// class
