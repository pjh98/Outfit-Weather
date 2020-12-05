
import java.awt.*;
import javax.swing.*;

public class cotton extends JFrame{
	ImageIcon image = new ImageIcon("src/img/cotton.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public cotton() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("면");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("면(cotton)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 80));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,400,190);
		
		panel.add(lb3);
		lb3.setText("<html>면은 밭에서 재배하는 목화 씨에 붙은 솜을 원료로 한 식물성 섬유입니다.<br>"+
		"감촉이 부드럽고 보송보송하고 산뜻하며, 땀을 잘 흡수하면서도 통기성이 좋아 통풍도 아주 잘 되는 재질입니다.<br>"+
				"물에 젖으면 강도가 강해지고 알칼리와 열에 강해 기계 세탁이 가능하지만, 옷을 오랫동안 유지하고 싶으시면 손세탁을 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}
