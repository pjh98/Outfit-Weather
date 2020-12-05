
import java.awt.*;
import javax.swing.*;

public class cashmere extends JFrame{
	ImageIcon image = new ImageIcon("src/img/cashmere.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public cashmere() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("캐시미어");
		this.setSize(1000,600);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("캐시미어(cashmere)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 60));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,600,190);
		
		panel.add(lb3);
		lb3.setText("<html>캐시미어는 캐시미어 염소나 티베트산 염소의 연한 털을 사용하여 만든 섬유입니다.<br>"+
		"섬유의 보석이라고도 불리는 캐시미어는 촉감이 매우 부드럽고 보온성이 뛰어나며, 가볍기 때문에 고급 옷감에 사용됩니다. 그러나 열과 강도가 약하기 때문에 취급할 때 주의를 해야 합니다.<br>"+
				"울과 마찬가지로 동물성 섬유이기 때문에 세탁을 자주 하지 않는 것이 좋으며, 고급 소재인 만큼 가급적 드라이를 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,300);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}