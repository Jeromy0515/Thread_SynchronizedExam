package timer;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer extends JFrame implements Runnable{
	private LocalDateTime time;
	private JLabel timeLabel;
	public Timer() {
		setSize(300,70);
		
		time = LocalDateTime.now();
		timeLabel = new JLabel("현재 시각:"+time.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
		timeLabel.setForeground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.add(timeLabel);
		
		new Thread(this).start();
		
		add(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				time = time.plusSeconds(1); 
				timeLabel.setText("현재 시각:"+time.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Timer().setVisible(true);;
	}

}
