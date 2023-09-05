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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.metal.MetalComboBoxUI;

@SuppressWarnings("serial")
public class EmployStuManageDialog extends JDialog {

	private Main main;

	public EmployStuManageDialog(Main main) {
		super(main, "관리자", true);
		this.main = main;
		Font font = new Font("Pretendard", Font.BOLD, 14);

		setLayout(null);

		// 타이틀
		JLabel jlblTitle = new JLabel("학생 관리");
		// 배경
		JLabel jlblback = new JLabel(
				new ImageIcon("C:/Users/user/git/group_prj/course_prj/src/kr/co/sist/prj/backgr.png"));
		// 검색
		DefaultComboBoxModel<String> dcbmSearch = new DefaultComboBoxModel<String>();
		JComboBox<String> jcbSearch = new JComboBox<String>(dcbmSearch);
		dcbmSearch.addElement("이름");
		dcbmSearch.addElement("사번");
		// 검색창
		JTextField jtfSearch = new JTextField();
		// 등록 버튼
		JButton jbtnAdd = new JButton("등록");
		// 조회 버튼
		JButton jbtnSearch = new JButton("조회");
		// 테이블
		JTable jtStu = new JTable();

		// setFont
		jlblTitle.setFont(new Font("Pretendard", Font.BOLD, 20));
		jcbSearch.setFont(font);
		jtfSearch.setFont(font);
		jbtnSearch.setFont(font);
		jbtnAdd.setFont(font);

		// setBounds
		jlblback.setBounds(0, 0, 900, 600);
		jlblTitle.setBounds(95, 50, 210, 50);
		jcbSearch.setBounds(470, 65, 100, 30);
		jtfSearch.setBounds(580, 65, 140, 30);
		jbtnSearch.setBounds(730, 65, 60, 30);
		jbtnAdd.setBounds(700, 450, 80, 30);

		// setBackground
		jcbSearch.setBackground(new Color(0xE0E0E0));
		jbtnSearch.setBackground(new Color(0xE0E0E0));
		jbtnAdd.setBackground(new Color(0xE0E0E0));
		jtfSearch.setBorder(new LineBorder(new Color(0xE0E0E0)));
		jbtnSearch.setBorder(null);
		jbtnAdd.setBorder(null);

		// add
		add(jcbSearch);
		add(jtfSearch);
		add(jbtnSearch);
		add(jlblTitle);
		add(jbtnAdd);

		// 배경
		add(jlblback);

		setBounds(main.getX() + 50, main.getY() + 50, 900, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
