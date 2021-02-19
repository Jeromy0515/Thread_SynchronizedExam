package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Coupon extends JFrame{
	JScrollPane scrollPane;
	public Coupon() {
		setSize(300,600);
		JPanel panels[] = new JPanel[4];
		for(int i=0;i<panels.length;i++) {
			panels[i] = new JPanel();
		}
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss")));
	}
	
	public static void main(String[] args) {
		new Coupon().setVisible(true);
	}

}
