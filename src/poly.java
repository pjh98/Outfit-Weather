
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
		this.setTitle("����������");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("����������(polyester)");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 65));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,700,190);
		
		panel.add(lb3);
		lb3.setText("<html>���������ʹ� ������� ���� �������� �������� �ռ� �����Դϴ�. "+
		"�������� ���� ������ �μ� ���� ��������, ���� ���ϰ� �����Ⱑ �� ���ٴ� ������ �ֽ��ϴ�.<br>"+
				"����Ź, ����� ��� �����ϸ� ��Ź�� ������������ �ִ� ���� ��õ�帳�ϴ�.</html>");
		lb3.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}