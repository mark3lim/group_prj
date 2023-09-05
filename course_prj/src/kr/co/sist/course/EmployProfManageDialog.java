package kr.co.sist.course;

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

@SuppressWarnings("serial")
public class EmployProfManageDialog extends JDialog {

//	private Main main;
	
	public EmployProfManageDialog () {
//		super(main,"관리자",true);
//		this.main=main;
		
		JLabel jlblTitle=new JLabel("교수관리");
		JLabel jlblback=new JLabel(new ImageIcon("E:/dev/workspace/html_prj/src/main/webapp/common/images/backgr.png"));
		DefaultComboBoxModel<String> dcbmSearch=new DefaultComboBoxModel<String>();
		JComboBox<String> jcbSearch=new JComboBox<String>(dcbmSearch);
		//ㅇㅇㅇㅇ
		
		dcbmSearch.addElement("사번");
		dcbmSearch.addElement("이름");
		
		JTextField jtfSearch=new JTextField();
		JButton jbtnAdd=new JButton("등록");
		JButton jbtnSearch=new JButton("조회");
		JTable jtProf=new JTable();

		
		jlblTitle.setBounds(95, 50, 210, 50);
		jcbSearch.setBounds(470, 65, 100, 30);
		jlblback.setBounds(0, 0, 1000, 700);
		jbtnSearch.setBounds(730, 65, 60, 30);
		jtfSearch.setBounds(580, 65, 140, 30);
//		jtProf.setBounds(500, 500, 100, 100);
		jbtnAdd.setBounds(700, 450, 80, 30);
		
		Font font=new Font("Pretendard", Font.BOLD, 14);
		jlblTitle.setFont(new Font("Pretendard", Font.BOLD, 20));
		jcbSearch.setFont(font);
		jtfSearch.setFont(font);
		jbtnSearch.setFont(font);
		jbtnAdd.setFont(font);
		//00
		
		add(jlblTitle);
//		add(jtProf);
		add(jbtnSearch);
		add(jbtnAdd);
		add(jtfSearch);
		add(jcbSearch);
		add(jlblback);
		
		setLayout(null);
		setResizable(false);
		
		setBounds(500, 100, 1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}//EmployProfManageDialog
	
	public static void main(String[] args) {
		new EmployProfManageDialog();
	}//mian
	
}//class
