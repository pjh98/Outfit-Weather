
import java.awt.*;
import javax.swing.*;

public class poly extends JFrame{
	ImageIcon image = new ImageIcon("src/img/poly.png");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public poly() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("폴리에스터");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("폴리에스터(polyester)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 65));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,700,190);
		
		panel.add(lb3);
		lb3.setText("<html>폴리에스터는 흡습성이 없는 폴리머의 일종으로 합성 섬유입니다. "+
		"내구성이 좋고 가격이 싸서 자주 사용되지만, 열에 약하고 정전기가 잘 난다는 단점이 있습니다.<br>"+
				"물세탁, 드라이 모두 가능하며 세탁시 섬유유연제를 넣는 것을 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}