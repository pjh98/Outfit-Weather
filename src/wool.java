
import java.awt.*;
import javax.swing.*;

public class wool extends JFrame{
	ImageIcon image = new ImageIcon("src/img/wool.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public wool() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("양모");
		this.setSize(1000,550);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("양모(wool)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 80));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,400,190);
		
		panel.add(lb3);
		lb3.setText("<html>울은 양털을 깎아서 만든 섬유입니다."+
		"흡수성이 좋고 신축성과 보온성이 좋아 고급 옷감, 겨울용 옷감, 편성물(니트)에 주로 사용됩니다.<br>"+
		"하지만 세탁할 때 마다 형태나 섬유구조가 손상될 수 있기 때문에 세탁을 자주 안하는 것이 좋습니다."+
		"가급적 드라이나 조심히 손빨래를 추천드리며, 기계세탁 시 세탁망 사용을 추천드립니다.<br>"+
				"울은 특별하게 하루, 이틀 옷걸이에 걸어 놓으면 자연세탁이 됩니다. 특별한 오염이 없다면 이 방법을 추천합니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,200,980,300);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}