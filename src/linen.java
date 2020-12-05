
import java.awt.*;
import javax.swing.*;

public class linen extends JFrame{
	ImageIcon image = new ImageIcon("src/img/linen.jpg");
	JLabel lb1 = new JLabel(image);
	JLabel lb2 = new JLabel();
	JLabel lb3 = new JLabel();

	
	public linen() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("린넨");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("린넨(linen)");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 80));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,400,190);
		
		panel.add(lb3);
		lb3.setText("<html>린넨은 마에서 추출한 식물성 원료이며 피부에 잘 달라붙지 않아 시원합니다. "+
		"땀 흡수가 잘 되고, 바람이 잘 통하여 여름용 소재로 많이 사용됩니다.<br>"+
				"드라이와 물세탁 모두 가능하지만, 구김에 약하고 곰팡이 필 수 있기 때문에 충분히 건조하여 보관에 유의해야 합니다.</html>");
		lb3.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}