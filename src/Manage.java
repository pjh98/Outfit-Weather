
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Manage extends JFrame{
	JLabel lb1 = new JLabel("재질 별 옷 관리");
	JButton cotton = new JButton("면");
	JButton wool = new JButton("울");
	JButton cashmere = new JButton("캐시미어");
	JButton denim = new JButton("데님");
	JButton leather = new JButton("가죽");
	JButton linen = new JButton("린넨");
	JButton suede = new JButton("스웨이드");
	JButton nylon = new JButton("나일론");
	JButton poly = new JButton("폴리에스터");
	
	public Manage() {
		MyPanel panel = new MyPanel();
		
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("옷 관리법");
		this.setSize(1000,1000);
		panel.setBackground(Color.white);
		this.setVisible(true);
		
		panel.add(lb1);
		lb1.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		lb1.setForeground(new Color(31, 110, 156));
		lb1.setBorder(BorderFactory.createEmptyBorder(0 , 10 , 0 , 0));
		lb1.setBounds(0,0,350,100);
		
		panel.add(cotton);
		cotton.setBounds(265,265,150,150);
		cotton.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		cotton.setForeground(new Color(31, 110, 156));
		cotton.setBackground(SystemColor.menu); 
		cotton.setOpaque(true);
		
		panel.add(wool);
		wool.setBounds(425,265,150,150);
		wool.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		wool.setForeground(new Color(31, 110, 156));
		wool.setBackground(SystemColor.menu); 
		wool.setOpaque(true);
		
		panel.add(cashmere);
		cashmere.setBounds(585,265,150,150);
		cashmere.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		cashmere.setForeground(new Color(31, 110, 156));
		cashmere.setBackground(SystemColor.menu); 
		cashmere.setOpaque(true);
		
		panel.add(denim);
		denim.setBounds(265,425,150,150);
		denim.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		denim.setForeground(new Color(31, 110, 156));
		denim.setBackground(SystemColor.menu); 
		denim.setOpaque(true);
		
		panel.add(leather);
		leather.setBounds(425,425,150,150);
		leather.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		leather.setForeground(new Color(31, 110, 156));
		leather.setBackground(SystemColor.menu); 
		leather.setOpaque(true);
		
		panel.add(linen);
		linen.setBounds(585,425,150,150);
		linen.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		linen.setForeground(new Color(31, 110, 156));
		linen.setBackground(SystemColor.menu); 
		linen.setOpaque(true);
		
		panel.add(suede);
		suede.setBounds(265,585,150,150);
		suede.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		suede.setForeground(new Color(31, 110, 156));
		suede.setBackground(SystemColor.menu); 
		suede.setOpaque(true);
		
		panel.add(nylon);
		nylon.setBounds(425,585,150,150);
		nylon.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		nylon.setForeground(new Color(31, 110, 156));
		nylon.setBackground(SystemColor.menu); 
		nylon.setOpaque(true);
		
		panel.add(poly);
		poly.setBounds(585,585,150,150);
		poly.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		poly.setForeground(new Color(31, 110, 156));
		poly.setBackground(SystemColor.menu); 
		poly.setOpaque(true);
		
		cotton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new cotton(); 
			}
		});
		
		wool.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new wool(); 
			}
		});
		
		cashmere.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new cashmere(); 
			}
		});
		
		denim.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new denim(); 
			}
		});
		
		linen.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new linen(); 
			}
		});
		
		suede.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new suede(); 
			}
		});
		
		leather.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new leather(); 
			}
		});
		
		nylon.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new nylon(); 
			}
		});
		
		poly.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new poly(); 
			}
		});
		
	}
	
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
}
