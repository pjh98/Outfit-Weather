
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
		this.setTitle("ĳ�ù̾�");
		this.setSize(1000,600);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("ĳ�ù̾�(cashmere)");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 60));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,600,190);
		
		panel.add(lb3);
		lb3.setText("<html>ĳ�ù̾�� ĳ�ù̾� ���ҳ� Ƽ��Ʈ�� ������ ���� ���� ����Ͽ� ���� �����Դϴ�.<br>"+
		"������ �����̶�� �Ҹ��� ĳ�ù̾�� �˰��� �ſ� �ε巴�� ���¼��� �پ��, ������ ������ ��� �ʰ��� ���˴ϴ�. �׷��� ���� ������ ���ϱ� ������ ����� �� ���Ǹ� �ؾ� �մϴ�.<br>"+
				"��� ���������� ������ �����̱� ������ ��Ź�� ���� ���� �ʴ� ���� ������, ��� ������ ��ŭ ������ ����̸� ��õ�帳�ϴ�.</html>");
		lb3.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,300);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}