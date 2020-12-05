import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Random;


public class Window extends JFrame{
	JLabel clock = new JLabel();
	JLabel temperature = new JLabel();
	JLabel temperature2 = new JLabel();
	JLabel Infor = new JLabel();
	JButton rec = new JButton("옷 추천받기");
	MyPanel panel = new MyPanel();
	Random r = new Random();
	
	String today;
	String weather[] = {"흐림","비","눈","맑음"};
	String num = Integer.toString(r.nextInt(3)+1);
	
	int high;
	int low;
	
	public Window() {	
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("정보");
		this.setSize(1000,1000);
		this.setVisible(true);		
		panel.setBackground(Color.white);
	}
	
	class MyPanel extends JPanel{
		public MyPanel(){			
		}
	}
	
	void today1() {
		String TestClass = "winterRecommend";  // 원래는 패키지 경로까지 적어야 하나 같은 default 경로라 생략
		String method ="c"+num;
			try {                       
				Class testClass = Class.forName(TestClass); 
				Object newObj = testClass.newInstance(); // 클래스의 받아온 정보를 기반으로 객체를 생성 
				Method m = testClass.getMethod(method); // 메소드 불러오기 
				m.invoke(newObj); // 메소드 호출		 				
			} catch (Exception e) {
			}
	}
	
	void today2() {
		String TestClass = "coldwaveRecommend";  // 원래는 패키지 경로까지 적어야 하나 같은 default 경로라 생략
		String method ="c"+num;
			try {                       
				Class testClass = Class.forName(TestClass); 
				Object newObj = testClass.newInstance(); // 클래스의 받아온 정보를 기반으로 객체를 생성 
				Method m = testClass.getMethod(method); // 메소드 불러오기 
				m.invoke(newObj); // 메소드 호출		 				
			} catch (Exception e) {
			}
	}
	
	public void d11_23() {
		today = weather[0];
		high = 11;
		low = 2;
		
		panel.add(clock);
		clock.setText("2020/11/23");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31,110,156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"11℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
				
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0<br>"+"자외선지수: 보통<br>"+ "바람: 북서 14km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		panel.add(rec);
		rec.setBounds(700,650,150,150);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		rec.setOpaque(true);
		
		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d11_24() {
		today = weather[0];
		high = 11;
		low = 2;
		
		panel.add(clock);
		clock.setText("2020/11/24");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"11℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0<br>"+"자외선지수: 보통<br>"+ "바람: 북서 14km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setOpaque(true);
		
		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_25() {
		today = weather[3];
		high = 11;
		low = 2;
		
		panel.add(clock);
		clock.setText("2020/11/25");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"11℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 15km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setOpaque(true);
		
		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_26() {
		today = weather[3];
		high = 6;
		low = 0;
		
		panel.add(clock);
		clock.setText("2020/11/26");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"6℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 13km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBounds(700,650,150,150);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		panel.add(rec);
		rec.setOpaque(true);
		
		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_27() {
		today = weather[3];
		high = 5;
		low = 1;
		
		panel.add(clock);
		clock.setText("2020/11/27");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"5℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_28() {
		today = weather[0];
		high = 7;
		low = 2;
		
		panel.add(clock);
		clock.setText("2020/11/28");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"7℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남 4km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBounds(700,650,150,150);
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		panel.add(rec);
		rec.setOpaque(true);
		
		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_29() {
		today = weather[0];
		high = 10;
		low = 3;
		
		panel.add(clock);
		clock.setText("2020/11/29");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남서 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	public void d11_30() {
		today = weather[0];
		high = 10;
		low = 2;
		
		panel.add(clock);
		clock.setText("2020/11/30");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 서북서 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_01() {
		today = weather[1];
		high = 8;
		low = 1;
		
		panel.add(clock);
		clock.setText("2020/12/01");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:1.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 북서 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_02() {
		today = weather[0];
		high = 6;
		low = -2;
		
		panel.add(clock);
		clock.setText("2020/12/02");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_03() {
		today = weather[0];
		high = 3;
		low = -4;
		
		panel.add(clock);
		clock.setText("2020/12/03");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 13km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_04() {
		today = weather[0];
		high = 3;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/04");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남남동 4km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_05() {
		today = weather[0];
		high = 7;
		low = 0;
		
		panel.add(clock);
		clock.setText("2020/12/05");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.6mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남동 4km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_06() {
		today = weather[0];
		high = 8;
		low = 0;
		
		panel.add(clock);
		clock.setText("2020/12/06");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:2.5mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남서 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_07(){
		today = weather[0];
		high = 8;
		low = -4;
		
		panel.add(clock);
		clock.setText("2020/12/07");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 보통<br>"+ "바람: 북서 13km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_08(){
		today = weather[0];
		high = 3;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/08");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 북동 2km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_09() {
		today = weather[0];
		high = 5;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/09");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 서북서 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_10() {
		today = weather[0];
		high = 3;
		low = -4;
		
		panel.add(clock);
		clock.setText("2020/12/10");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 북북동 6km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_11() {
		today = weather[0];
		high = 5;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/11");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남남동 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_12() {
		today = weather[0];
		high = 6;
		low = 0;
		
		panel.add(clock);
		clock.setText("2020/12/12");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:2.3mm<br>"+"자외선지수: 낮음<br>"+ "바람: 동 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_13() {
		today = weather[0];
		high = 6;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/13");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남서 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_14() {
		today = weather[0];
		high = 7;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/14");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 북서 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_15() {
		today = weather[0];
		high = 7;
		low = 0;
		
		panel.add(clock);
		clock.setText("2020/12/15");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 동북동 11km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_16() {
		today = weather[0];
		high = 7;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/16");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 동북동 22km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_17() {
		today = weather[1];
		high = 7;
		low = -1;
		
		panel.add(clock);
		clock.setText("2020/12/17");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:2.2mm<br>"+"자외선지수: 낮음<br>"+ "바람: 동북동 20km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_18() {
		today = weather[0];
		high = 6;
		low = -2;
		
		panel.add(clock);
		clock.setText("2020/12/18");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.8mm<br>"+"자외선지수: 낮음<br>"+ "바람: 서북서 24km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_19() {
		today = weather[0];
		high = 6;
		low = -2;
		
		panel.add(clock);
		clock.setText("2020/12/19");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.0mm<br>"+"자외선지수: 낮음<br>"+ "바람: 동남동 9km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}
	
	public void d12_20() {
		today = weather[0];
		high = 6;
		low = -2;
		
		panel.add(clock);
		clock.setText("2020/12/20");
		clock.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		clock.setForeground(new Color(31, 110, 156));
		clock.setBounds(800,0,200,100);
		
		panel.add(temperature);
		temperature.setText("<html>TODAY<br>"+"10℃</html>");
		temperature.setFont(new Font("함초롬돋움", Font.PLAIN, 100));
		temperature.setForeground(new Color(31, 110, 156));
		temperature.setBounds(300,50,400,400);
		
		panel.add(temperature2);
		temperature2.setText("최고:"+high+ "℃  최저:"+low+"℃ ");
		temperature2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		temperature2.setForeground(new Color(31, 110, 156));
		temperature2.setBounds(300,400,500,100);
		
		panel.add(Infor);
		Infor.setText("<html>"+today+"<br>"+"강수:0.2mm<br>"+"자외선지수: 낮음<br>"+ "바람: 남남동 15km/h</html>");
		Infor.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		Infor.setForeground(new Color(31, 110, 156));
		Infor.setBounds(300,500,500,400);
		
		rec.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		rec.setBackground(SystemColor.menu);
		rec.setForeground(new Color(31, 110, 156));
		rec.setBounds(700,650,150,150);
		panel.add(rec);
		rec.setOpaque(true);

		if(today == "비" || today == "눈" ) {
			JOptionPane.showMessageDialog(null, "외출할 때 우산을 챙겨주시고, 가죽, 스웨이드 제품은 삼가해주세요!" );
		}
		rec.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(high >7) {
					today1();
				}else if(high <= 7) {
					today2();
				}
			}
		});
	}	
}