
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
		this.setTitle("��");
		this.setSize(1000,500);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
		panel.add(lb1);	
		lb1.setBounds(10,10,180,180);
		
		panel.add(lb2);
		lb2.setText("��(cotton)");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 80));
		lb2.setForeground(new Color(31, 110, 156));
		lb2.setBounds(200,10,400,190);
		
		panel.add(lb3);
		lb3.setText("<html>���� �翡�� ����ϴ� ��ȭ ���� ���� ���� ����� �� �Ĺ��� �����Դϴ�.<br>"+
		"������ �ε巴�� ���ۺ����ϰ� ����ϸ�, ���� �� ����ϸ鼭�� ��⼺�� ���� ��ǳ�� ���� �� �Ǵ� �����Դϴ�.<br>"+
				"���� ������ ������ �������� ��Į���� ���� ���� ��� ��Ź�� ����������, ���� �������� �����ϰ� �����ø� �ռ�Ź�� ��õ�帳�ϴ�.</html>");
		lb3.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb3.setForeground(new Color(70,70,70));
		lb3.setBounds(10,230,980,200);
		
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}
