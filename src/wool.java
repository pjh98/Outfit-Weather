
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
		this.setTitle("���");
		this.setSize(1000,550);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("���(wool)");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 80));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,400,190);
		
		panel.add(lb3);
		lb3.setText("<html>���� ������ ��Ƽ� ���� �����Դϴ�."+
		"������� ���� ���༺�� ���¼��� ���� ��� �ʰ�, �ܿ�� �ʰ�, ����(��Ʈ)�� �ַ� ���˴ϴ�.<br>"+
		"������ ��Ź�� �� ���� ���³� ���������� �ջ�� �� �ֱ� ������ ��Ź�� ���� ���ϴ� ���� �����ϴ�."+
		"������ ����̳� ������ �ջ����� ��õ�帮��, ��輼Ź �� ��Ź�� ����� ��õ�帳�ϴ�.<br>"+
				"���� Ư���ϰ� �Ϸ�, ��Ʋ �ʰ��̿� �ɾ� ������ �ڿ���Ź�� �˴ϴ�. Ư���� ������ ���ٸ� �� ����� ��õ�մϴ�.</html>");
		lb3.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,200,980,300);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}