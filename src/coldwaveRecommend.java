import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class coldwaveRecommend extends JFrame {
	MyPanel panel = new MyPanel();
	JLabel lb2 = new JLabel();
	
	
	public coldwaveRecommend() {		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("한파 옷차림추천");
		this.setSize(1000,600);
		this.setVisible(true);
		panel.setBackground(Color.white);
		
	}
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}	
	public void c1(){
		ImageIcon image = new ImageIcon("src/img/cc1.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("추운 날씨입니다. 따뜻한 패딩을 추천드립니다.");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
	
	public void c2(){
		ImageIcon image = new ImageIcon("src/img/cc2.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("추운 날씨입니다. 따뜻한 패딩을 추천드립니다.");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
	
	public void c3(){
		ImageIcon image = new ImageIcon("src/img/cc3.jpg");
		Image image1 = image.getImage();
		Image image2 = image1.getScaledInstance(250,400, Image.SCALE_SMOOTH);
		ImageIcon image3 = new ImageIcon(image2);
		
		JLabel lb1 = new JLabel(image3);
		panel.add(lb1);	
		lb1.setBounds(10,10,250,400);
		panel.add(lb2);
		lb2.setText("추운 날씨입니다. 히트텍을 입고 두꺼운 울코트를 추천드립니다.");
		lb2.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		lb2.setForeground(new Color(70,70,70));
		lb2.setBounds(10,410,980,100);
	}
}