package kr.co.sist.prj;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Kiy extends JFrame {

	public Kiy() {
		
		String name=JOptionPane.showInputDialog(rootPane, "★당신의 이름은?★");
		JOptionPane.showMessageDialog(rootPane, name+"님 치맥 사주세요 ๑◕‿‿◕๑");
	}
	
	public static void main(String[] args) {
		new Kiy();
		
		
	}// main

}// class
