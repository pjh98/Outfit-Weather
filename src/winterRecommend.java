import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class winterRecommend extends JFrame {
	MyPanel panel = new MyPanel();
	JLabel lb2 = new JLabel();
	
	public winterRecommend() {		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("�ܿ� ��������õ");
		this.setSize(1000,600);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}	
	public void c1(){
		ImageIcon image = new ImageIcon("src/img/c1.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("�ټ� �߿� �����Դϴ�. �β��� �������� ��õ�帳�ϴ�.");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
	
	public void c2(){
		ImageIcon image = new ImageIcon("src/img/c2.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("�ټ� �߿� �����Դϴ�. ����Ʈ�� ��õ�帳�ϴ�.");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
	
	public void c3(){
		ImageIcon image = new ImageIcon("src/img/c3.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("�ټ� �߿� �����Դϴ�. ������ �е��� ��õ�帳�ϴ�.");
		lb2.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
}
