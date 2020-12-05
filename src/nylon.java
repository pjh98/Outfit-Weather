
import java.awt.*;
import javax.swing.*;

public class nylon extends JFrame{
	ImageIcon image = new ImageIcon("src/img/nylon.png");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public nylon() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("나일론");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("나일론(nylon)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 65));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,700,190);
		
		panel.add(lb3);
		lb3.setText("<html>나일론은 폴리아미드계 합성 섬유에 붙여진 이름입니다. "+
		"거미줄보다 가늘고 마찰에 강하며 인장강도가 다른 섬유보다 월등하지만, 정전기가 잘 일어난다는 단점이 있습니다.<br>"+
				"세탁이 쉬워 저온세탁을 통해 세탁가능하며, 햇빛에 약하기 때문에 건조시 그늘에 말리는 것을 추천드립니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}