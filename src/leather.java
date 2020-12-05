
import java.awt.*;
import javax.swing.*;

public class leather extends JFrame{
	ImageIcon image = new ImageIcon("src/img/leather.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public leather() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("가죽");
		this.setSize(1000,650);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("가죽(leather)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 60));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,600,190);
		
		panel.add(lb3);
		lb3.setText("<html>가죽은 동물의 몸에서 벗겨 낸 껍질을 가공해서 만든 재질입니다.<br>"+
		"가죽은 대체로 두께가 두껍고 내구성이 강하여 자켓, 가방에 자주 사용됩니다. 하지만 가죽은 생명의 일부이니만큼 시간이 흐름에 따라 에이징이 되며 부드러워지고 색이 변하기도 합니다.<br>"+
		"또한 변질될 수 있기 때문에 물에 닿지 않게 하고 곰팡이에 유의해야 합니다.<br>"+
				"물에 젖으면 강도가 강해지고 알칼리와 열에 강해 기계 세탁이 가능하지만, 옷을 오랫동안 유지하고 싶으시면 손세탁을 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,350);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}