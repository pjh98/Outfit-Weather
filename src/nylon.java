
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
		this.setTitle("���Ϸ�");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("���Ϸ�(nylon)");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 65));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,700,190);
		
		panel.add(lb3);
		lb3.setText("<html>���Ϸ��� �����ƹ̵�� �ռ� ������ �ٿ��� �̸��Դϴ�. "+
		"�Ź��ٺ��� ���ð� ������ ���ϸ� ���尭���� �ٸ� �������� ����������, �����Ⱑ �� �Ͼ�ٴ� ������ �ֽ��ϴ�.<br>"+
				"��Ź�� ���� ���¼�Ź�� ���� ��Ź�����ϸ�, �޺��� ���ϱ� ������ ������ �״ÿ� ������ ���� ��õ�帳�ϴ�.</html>");
		lb3.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}