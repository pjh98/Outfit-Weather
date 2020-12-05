
import java.awt.*;
import javax.swing.*;

public class suede extends JFrame{
	ImageIcon image = new ImageIcon("src/img/suede.png");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public suede() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("스웨이드");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("스웨이드(suede)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 70));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,600,190);
		
		panel.add(lb3);
		lb3.setText("<html>스웨이드는 새끼 양이나 새끼 소 따위의 가죽 뒷면을 보드랍게 보풀린 가죽입니다. <br>"+
		"부드러운 텍스처 덕분에 따뜻한 느낌을 주어서 겨울 부츠, 운동화 등에 많이 사용됩니다.<br>"+
		"반면, 물과 오염에 취약한 특성을 가지고 있어서 드라이클리닝이 필수적이며, 오염이 작을 시 스웨이드 클리너 사용을 추천드립니다.<br>"+
				"또한 열원에 가까이 할시 고유의 외관과 촉감이 상실될 수 있으므로 주의가 필요합니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}