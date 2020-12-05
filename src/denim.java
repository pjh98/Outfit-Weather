
import java.awt.*;
import javax.swing.*;

public class denim extends JFrame{
	ImageIcon image = new ImageIcon("src/img/denim.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public denim() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("데님");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("데님(denim)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 65));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,700,190);
		
		panel.add(lb3);
		lb3.setText("<html>데님은 선염사로 능직한 목면지입니다. "+
		"매우 질기고 내구성이 강하여 손상이 잘 나지 않아 실용적입니다.<br>"+
				"주로 청바지를 만들때 사용하며, 워싱이 들어간 데님은 물빠짐이 있어 단독세탁을 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}